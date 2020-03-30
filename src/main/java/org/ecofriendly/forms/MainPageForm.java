package org.ecofriendly.forms;

import lombok.Data;

@Data
public class MainPageForm {
    private boolean isPlastic;
    private boolean isPaper;
    private boolean isGlass;
    private boolean isClothes;
    private boolean isBatteries;
    private boolean isElectornics;
    private boolean isMetal;
    private boolean isDangerous;
    private boolean isOther;
}
