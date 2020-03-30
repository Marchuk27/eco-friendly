package org.ecofriendly.forms;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
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
