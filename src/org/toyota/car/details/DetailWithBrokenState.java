package org.toyota.car.details;

public abstract class DetailWithBrokenState extends Detail {
    private boolean isBroken;

    public DetailWithBrokenState(boolean isBroken) {
        this.isBroken = isBroken;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }
}
