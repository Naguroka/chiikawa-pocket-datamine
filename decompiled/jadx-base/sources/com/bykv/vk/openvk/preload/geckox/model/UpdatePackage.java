package com.bykv.vk.openvk.preload.geckox.model;

/* JADX INFO: loaded from: classes3.dex */
public class UpdatePackage {
    private java.lang.String accessKey;

    @com.bykv.vk.openvk.preload.a.a.b(a = "channel")
    private java.lang.String channel;

    @com.bykv.vk.openvk.preload.a.a.b(a = "channel_index")
    private int channelIndex;

    @com.bykv.vk.openvk.preload.a.a.b(a = "content")
    private com.bykv.vk.openvk.preload.geckox.model.UpdatePackage.Content content;

    @com.bykv.vk.openvk.preload.a.a.b(a = "group_name")
    private java.lang.String groupName;
    private long localVersion;

    @com.bykv.vk.openvk.preload.a.a.b(a = "package_type")
    private int packageType;

    @com.bykv.vk.openvk.preload.a.a.b(a = "package_version")
    private long version;

    public static final class FileType {
        public static final int COMPRESSED_FILE = 0;
        public static final int MY_ARCHIVE_FILE = 2;
        public static final int UNCOMPRESSED_FILE = 1;
    }

    public java.lang.String getAccessKey() {
        return this.accessKey;
    }

    public void setAccessKey(java.lang.String str) {
        this.accessKey = str;
    }

    public UpdatePackage() {
    }

    public UpdatePackage(long j, java.lang.String str, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage.Package r4, com.bykv.vk.openvk.preload.geckox.model.UpdatePackage.Package r5) {
        this.version = j;
        this.channel = str;
        com.bykv.vk.openvk.preload.geckox.model.UpdatePackage.Content content = new com.bykv.vk.openvk.preload.geckox.model.UpdatePackage.Content();
        this.content = content;
        content.fullPackage = r4;
        this.content.patch = r5;
    }

    public java.lang.String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(java.lang.String str) {
        this.groupName = str;
    }

    public int getChannelIndex() {
        return this.channelIndex;
    }

    public void setChannelIndex(int i) {
        this.channelIndex = i;
    }

    public long getLocalVersion() {
        return this.localVersion;
    }

    public void setLocalVersion(long j) {
        this.localVersion = j;
    }

    public long getVersion() {
        return this.version;
    }

    public void setVersion(long j) {
        this.version = j;
    }

    public java.lang.String getChannel() {
        return this.channel;
    }

    public void setChannel(java.lang.String str) {
        this.channel = str;
    }

    public com.bykv.vk.openvk.preload.geckox.model.UpdatePackage.Package getFullPackage() {
        return this.content.fullPackage;
    }

    public void setFullPackage(com.bykv.vk.openvk.preload.geckox.model.UpdatePackage.Package r2) {
        this.content.fullPackage = r2;
    }

    public com.bykv.vk.openvk.preload.geckox.model.UpdatePackage.Package getPatch() {
        return this.content.patch;
    }

    public void setPatch(com.bykv.vk.openvk.preload.geckox.model.UpdatePackage.Package r2) {
        this.content.patch = r2;
    }

    public com.bykv.vk.openvk.preload.geckox.model.UpdatePackage.Strategy getStrategy() {
        return this.content.strategy;
    }

    public void setStrategy(com.bykv.vk.openvk.preload.geckox.model.UpdatePackage.Strategy strategy) {
        this.content.strategy = strategy;
    }

    public boolean isFullUpdate() {
        return getFullPackage() != null && getFullPackage().getUrlList().size() > 0;
    }

    public boolean isPatchUpdate() {
        return getPatch() != null && getPatch().getUrlList().size() > 0;
    }

    public int getPackageType() {
        return this.packageType;
    }

    public java.lang.String toString() {
        return "UpdatePackage{version=" + this.version + ", channel='" + this.channel + "', content=" + this.content + ", packageType=" + this.packageType + '}';
    }

    public static class Package {

        @com.bykv.vk.openvk.preload.a.a.b(a = "id")
        long id;

        @com.bykv.vk.openvk.preload.a.a.b(a = "size")
        long length;

        @com.bykv.vk.openvk.preload.a.a.b(a = "md5")
        java.lang.String md5;

        @java.lang.Deprecated
        java.lang.String url;

        @com.bykv.vk.openvk.preload.a.a.b(a = "url_list")
        java.util.List<java.lang.String> urlList;

        public Package() {
        }

        public Package(int i, java.util.List<java.lang.String> list, java.lang.String str) {
            this.id = i;
            this.urlList = list;
            this.md5 = str;
        }

        public long getId() {
            return this.id;
        }

        public void setId(int i) {
            this.id = i;
        }

        public java.lang.String getUrl() {
            return this.url;
        }

        public void setUrl(java.lang.String str) {
            this.url = str;
        }

        public java.lang.String getMd5() {
            return this.md5;
        }

        public void setMd5(java.lang.String str) {
            this.md5 = str;
        }

        public long getLength() {
            return this.length;
        }

        public java.util.List<java.lang.String> getUrlList() {
            return this.urlList;
        }

        public void setUrlList(java.util.List<java.lang.String> list) {
            this.urlList = list;
        }

        public java.lang.String toString() {
            return "Package{url='" + this.url + "', md5='" + this.md5 + "'}";
        }
    }

    public static class Content {

        @com.bykv.vk.openvk.preload.a.a.b(a = "package")
        private com.bykv.vk.openvk.preload.geckox.model.UpdatePackage.Package fullPackage;

        @com.bykv.vk.openvk.preload.a.a.b(a = "patch")
        private com.bykv.vk.openvk.preload.geckox.model.UpdatePackage.Package patch;

        @com.bykv.vk.openvk.preload.a.a.b(a = "strategies")
        private com.bykv.vk.openvk.preload.geckox.model.UpdatePackage.Strategy strategy;
    }

    public static class Strategy {

        @com.bykv.vk.openvk.preload.a.a.b(a = "del_if_download_failed")
        private boolean deleteIfFail;

        @com.bykv.vk.openvk.preload.a.a.b(a = "del_old_pkg_before_download")
        private boolean deleteOldPackageBeforeDownload;

        @com.bykv.vk.openvk.preload.a.a.b(a = "need_unzip")
        private boolean needUnzip;

        public Strategy(int i) {
            this.deleteIfFail = i == 1;
        }

        public boolean isDeleteIfFail() {
            return this.deleteIfFail;
        }

        public void setDeleteIfFail(boolean z) {
            this.deleteIfFail = z;
        }

        public boolean isDeleteOldPackageBeforeDownload() {
            return this.deleteOldPackageBeforeDownload;
        }

        public void setDeleteOldPackageBeforeDownload(boolean z) {
            this.deleteOldPackageBeforeDownload = z;
        }

        public boolean isNeedUnzip() {
            return this.needUnzip;
        }

        public void setNeedUnzip(boolean z) {
            this.needUnzip = z;
        }
    }
}
