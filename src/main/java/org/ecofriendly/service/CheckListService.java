package org.ecofriendly.service;

import org.apache.commons.lang3.StringUtils;
import org.ecofriendly.db.entity.user.Account;
import org.ecofriendly.db.repository.AccountRepository;
import org.ecofriendly.db.repository.CheckListRepository;
import org.ecofriendly.utils.AchievementUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class CheckListService {
    @Autowired
    private CheckListRepository checkListRepository;
    @Autowired
    private AccountRepository accountRepository;
    private AchievementUtils achievementUtils;

    public List<String> getIdeaListByAccount_Username(String username) {
        return new ArrayList<>(checkListRepository.getCheckListByAccount_Username(username).getSavedIdeas());
    }

    public void checkIdeaListForAchieves(List<String> ideaList, String username) {
        achievementUtils = new AchievementUtils();
        Account account = accountRepository.findAccountByUsername(username);
        List<Integer> achievementList = account.getAchievementList();
        achievementUtils.checkCheckListForAchieves(achievementList, ideaList);

        account.setAchievementList(achievementList);
        accountRepository.save(account);
    }

    private boolean checkIdeaToFill(String idea) {
        return Objects.isNull(idea) || StringUtils.isEmpty(idea);
    }

    private List<String> checkCurrentListForNullOrEmpty(List<String> ideasList) {
        if (Objects.isNull(ideasList) || ideasList.size() == 0) {
            return new ArrayList<>();
        }
        return ideasList;
    }
}
