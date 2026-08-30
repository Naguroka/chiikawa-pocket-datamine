package com.bykv.vk.openvk.preload.geckox.statistic.model;

/* JADX INFO: loaded from: classes3.dex */
public class StatisticModel {

    @com.bykv.vk.openvk.preload.a.a.b(a = "common")
    public com.bykv.vk.openvk.preload.geckox.model.Common common;

    @com.bykv.vk.openvk.preload.a.a.b(a = "packages")
    public java.util.List<com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel> packages = new java.util.ArrayList();

    public static class PackageStatisticModel {

        @com.bykv.vk.openvk.preload.a.a.b(a = "ac")
        public java.lang.String ac;

        @com.bykv.vk.openvk.preload.a.a.b(a = "access_key")
        public java.lang.String accessKey;

        @com.bykv.vk.openvk.preload.a.a.b(a = "active_check_duration")
        public java.lang.Long activeCheckDuration;

        @com.bykv.vk.openvk.preload.a.a.b(a = "apply_duration")
        public java.lang.Long applyDuration;

        @com.bykv.vk.openvk.preload.a.a.b(a = "channel")
        public java.lang.String channel;

        @com.bykv.vk.openvk.preload.a.a.b(a = "clean_duration")
        public java.lang.Long cleanDuration;

        @com.bykv.vk.openvk.preload.a.a.b(a = "clean_strategy")
        public java.lang.Integer cleanStrategy;

        @com.bykv.vk.openvk.preload.a.a.b(a = "clean_type")
        public java.lang.Integer cleanType;

        @com.bykv.vk.openvk.preload.a.a.b(a = "download_duration")
        public java.lang.Long downloadDuration;

        @com.bykv.vk.openvk.preload.a.a.b(a = "download_fail_records")
        public java.util.List<com.bykv.vk.openvk.preload.geckox.statistic.model.StatisticModel.PackageStatisticModel.DownloadFailRecords> downloadFailRecords;

        @com.bykv.vk.openvk.preload.a.a.b(a = "download_retry_times")
        public java.lang.Integer downloadRetryTimes;

        @com.bykv.vk.openvk.preload.a.a.b(a = "download_url")
        public java.lang.String downloadUrl;

        @com.bykv.vk.openvk.preload.a.a.b(a = "err_code")
        public java.lang.String errCode;

        @com.bykv.vk.openvk.preload.a.a.b(a = "err_msg")
        public java.lang.String errMsg;

        @com.bykv.vk.openvk.preload.a.a.b(a = "group_name")
        public java.lang.String groupName;

        @com.bykv.vk.openvk.preload.a.a.b(a = "id")
        public java.lang.Long id;

        @com.bykv.vk.openvk.preload.a.a.b(a = "log_id")
        public java.lang.String logId;

        @com.bykv.vk.openvk.preload.a.a.b(a = "patch_id")
        public java.lang.Long patchId;

        @com.bykv.vk.openvk.preload.a.a.b(a = "stats_type")
        public java.lang.Integer statsType;

        public static class DownloadFailRecords {

            @com.bykv.vk.openvk.preload.a.a.b(a = com.ironsource.y8.i.D)
            public java.lang.String domain;

            @com.bykv.vk.openvk.preload.a.a.b(a = "reason")
            public java.lang.String reason;

            public DownloadFailRecords(java.lang.String str, java.lang.String str2) {
                this.domain = str;
                this.reason = str2;
            }
        }
    }
}
