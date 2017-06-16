package com.hammer.sickle;

/**
 * Created by YangYang on 15/6/2017.
 */
public class Ref {
    public static enum Items{
        HILT("hilt","itemhilt");
        private String unlocalizedName,registryName;
        Items(String unlocalizedName, String registryName){
        this.unlocalizedName=unlocalizedName;
        this.registryName=registryName;
        }
        public String getUnlocalizedName(){
            return unlocalizedName;
        }
        public String getRegistryName(){
            return registryName;
        }
    }
}
