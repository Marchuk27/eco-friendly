package org.ecofriendly.service;

import org.apache.commons.lang3.StringUtils;
import org.ecofriendly.db.entity.CheckList;
import org.ecofriendly.db.repository.CheckListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class CheckListService {
    @Autowired
    private CheckListRepository checkListRepository;

    public void saveIdeaToProductList(CheckList checkListPage) {
        if (checkIdeaToFill(checkListPage.getIdeaInput())) {
            return ;
        }
        List<String> checkList = checkCurrentListForNullOrEmpty(checkListPage.getSavedIdeas());
        checkList.add(checkListPage.getIdeaInput());
        checkListPage.setIdeaInput(StringUtils.EMPTY);
    }

    public List<String> getCheckListByAccountId(Long userAccountId) {
        return new ArrayList<>(checkListRepository.getCheckListByUserAccount_Id(userAccountId).getSavedIdeas());
    }

    private boolean checkIdeaToFill(String idea) { ;
        return Objects.isNull(idea) || StringUtils.isEmpty(idea);
    }

    private List<String> checkCurrentListForNullOrEmpty(List<String> ideasList) {
        if (Objects.isNull(ideasList) || ideasList.size() == 0) {
            return new ArrayList<>();
        }
        return ideasList;
    }
}
