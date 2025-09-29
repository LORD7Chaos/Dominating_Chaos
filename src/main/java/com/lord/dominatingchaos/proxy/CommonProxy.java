package com.lord.dominatingchaos.proxy;

import com.lord.dominatingchaos.init.ModBlocks;
import com.lord.dominatingchaos.init.ModItems;

public class CommonProxy {

    public void preInit() {
        ModItems.init();
        ModBlocks.init();
    }

    public void init() {
    }

    public void postInit() { }
}