package com.breezefieldsalesnexara.app.utils.swipemenulayout.listener;


import com.breezefieldsalesnexara.app.utils.swipemenulayout.SwipeMenuLayout;

public interface SwipeFractionListener {
    void beginMenuSwipeFraction(SwipeMenuLayout swipeMenuLayout, float fraction);

    void endMenuSwipeFraction(SwipeMenuLayout swipeMenuLayout, float fraction);
}
