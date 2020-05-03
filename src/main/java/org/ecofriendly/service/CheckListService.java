package org.ecofriendly.service;

import org.ecofriendly.db.entity.CheckList;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class CheckListService {

    public void saveIdeaToProductList(CheckList checkListPage) {
        if (checkIdeaToFill(checkListPage.getIdeaInput())) {
            return ;
        }
        List<String> checkList = checkCurrentListForNullOrEmpty(checkListPage.getSavedIdeas());
        checkList.add(checkListPage.getIdeaInput());
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
