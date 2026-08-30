package com.bykv.vk.openvk.preload.geckox.model;

/* JADX INFO: loaded from: classes3.dex */
public class CheckRequestBodyModel {

    @com.bykv.vk.openvk.preload.a.a.b(a = "common")
    private com.bykv.vk.openvk.preload.geckox.model.Common common;

    @com.bykv.vk.openvk.preload.a.a.b(a = "custom")
    private java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> custom;

    @com.bykv.vk.openvk.preload.a.a.b(a = "deployment")
    private java.util.Map<java.lang.String, java.util.List<com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel.ChannelInfo>> deployment;

    @com.bykv.vk.openvk.preload.a.a.b(a = "deployments")
    private java.util.Map<java.lang.String, java.lang.Object> deployments;

    @com.bykv.vk.openvk.preload.a.a.b(a = "local")
    private java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel.LocalChannel>> local;

    public static class Channels {

        @com.bykv.vk.openvk.preload.a.a.b(a = "channels")
        public java.util.List<com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel.Channel> channels = new java.util.ArrayList();
    }

    public static class Group {

        @com.bykv.vk.openvk.preload.a.a.b(a = "group_name")
        public java.lang.String groupName;

        @com.bykv.vk.openvk.preload.a.a.b(a = "target_channels")
        public java.util.List<com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel.TargetChannel> targetChannels;
    }

    public static class LocalChannel {

        @com.bykv.vk.openvk.preload.a.a.b(a = "l_v")
        public java.lang.Long localVersion;
    }

    public static class ProcessorParams {

        @com.bykv.vk.openvk.preload.a.a.b(a = com.ironsource.y8.i.D)
        public java.lang.String domain;
    }

    public void setDeployments(java.util.Map<java.lang.String, java.lang.Object> map) {
        this.deployments = map;
    }

    public void setLocal(java.util.Map<java.lang.String, java.util.Map<java.lang.String, com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel.LocalChannel>> map) {
        this.local = map;
    }

    public void setCustom(java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> map) {
        this.custom = map;
    }

    public void setCommon(com.bykv.vk.openvk.preload.geckox.model.Common common) {
        this.common = common;
    }

    public void putChannelInfo(java.lang.String str, java.util.List<com.bykv.vk.openvk.preload.geckox.model.CheckRequestBodyModel.ChannelInfo> list) {
        if (this.deployment == null) {
            this.deployment = new java.util.HashMap();
        }
        this.deployment.put(str, list);
    }

    public static class ChannelInfo {

        @com.bykv.vk.openvk.preload.a.a.b(a = "channel")
        private java.lang.String channel;

        @com.bykv.vk.openvk.preload.a.a.b(a = "local_version")
        private long localVersion;

        public ChannelInfo(java.lang.String str, long j) {
            this.channel = str;
            this.localVersion = j;
        }
    }

    public enum GroupType {
        NORMAL(com.adjust.sdk.Constants.NORMAL),
        HIGHPRIORITY("high_priority");

        private java.lang.String value;

        GroupType(java.lang.String str) {
            this.value = str;
        }

        public final java.lang.String getValue() {
            return this.value;
        }
    }

    public static class TargetChannel {

        @com.bykv.vk.openvk.preload.a.a.b(a = "c")
        public java.lang.String channelName;

        @com.bykv.vk.openvk.preload.a.a.b(a = "t_v")
        public java.lang.Long targetVersion;

        public TargetChannel() {
        }

        public TargetChannel(java.lang.String str) {
            this.channelName = str;
        }

        public TargetChannel(java.lang.String str, java.lang.Long l) {
            this.channelName = str;
            this.targetVersion = l;
        }
    }

    public static class Channel {

        @com.bykv.vk.openvk.preload.a.a.b(a = "c")
        java.lang.String channelName;

        @com.bykv.vk.openvk.preload.a.a.b(a = "l_v")
        public java.lang.String localVersion;

        public Channel(java.lang.String str) {
            this.channelName = str;
        }
    }
}
