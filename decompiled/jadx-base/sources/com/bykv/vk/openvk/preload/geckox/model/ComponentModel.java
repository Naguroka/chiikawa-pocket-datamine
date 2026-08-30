package com.bykv.vk.openvk.preload.geckox.model;

/* JADX INFO: loaded from: classes3.dex */
public class ComponentModel {

    @com.bykv.vk.openvk.preload.a.a.b(a = "packages")
    private java.util.Map<java.lang.String, java.util.List<com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>> packages;

    @com.bykv.vk.openvk.preload.a.a.b(a = "universal_strategies")
    private java.util.Map<java.lang.String, com.bykv.vk.openvk.preload.geckox.model.ComponentModel.a> universalStrategies;

    public static class a {
    }

    public java.util.Map<java.lang.String, java.util.List<com.bykv.vk.openvk.preload.geckox.model.UpdatePackage>> getPackages() {
        return this.packages;
    }

    public java.util.Map<java.lang.String, com.bykv.vk.openvk.preload.geckox.model.ComponentModel.a> getUniversalStrategies() {
        return this.universalStrategies;
    }
}
