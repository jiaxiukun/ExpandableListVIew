package com.test.expandablelistview;

import java.util.List;

/**
 * 作者: 贾秀坤
 * 时间: 2017/9/21
 * 类作用:
 */

public class Shangjia {
    boolean isChcked;
    List<ShangPin> shangPinList;

    public boolean isChcked() {
        return isChcked;
    }

    public void setChcked(boolean chcked) {
        isChcked = chcked;
    }

    public List<ShangPin> getShangPinList() {
        return shangPinList;
    }

    public void setShangPinList(List<ShangPin> shangPinList) {
        this.shangPinList = shangPinList;
    }
}
