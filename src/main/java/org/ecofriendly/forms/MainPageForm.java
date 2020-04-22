package org.ecofriendly.forms;

import lombok.Getter;
import lombok.Setter;
import org.ecofriendly.db.entity.company.Category;

import java.util.List;

public class MainPageForm {

    @Getter
    @Setter
    private List<Category> chosenCategories;
//
//    private boolean isPlastic;
//    private boolean isPaper;
//    private boolean isGlass;
//    private boolean isClothes;
//    private boolean isBatteries;
//    private boolean isElectornics;
//    private boolean isMetal;
//    private boolean isDangerous;
//    private boolean isOther;
}
