package com.aperture.breaktheseptenary;

/**
 * Created by YangYang on 20/5/2017.
 */
public class BackEnd {
    public static final String MODID = "aptbts";
    public static final String VERSION = "ALPHA";
    public static final String NAME="Aperture: Breaking the Septenary";
    public static final String VERSIONS="[1.9.4,1.10.2]";

    public static final String CLIENT_PROXY_CLASS="com.aperture.breaktheseptenary.Proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS="com.aperture.breaktheseptenary.Proxy.ServerProxy";

    public static enum Items{
        HEMP("hemp","hemp");
        private String ULName,RegName;
        Items(String ULName,String RegName){
            this.ULName=ULName;
            this.RegName=RegName;
        }
        public String getUnlocalizedName(){
            return ULName;
        }
        public String getRegistryName(){
            return RegName;
        }
    }
}
