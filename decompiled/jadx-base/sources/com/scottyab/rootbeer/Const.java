package com.scottyab.rootbeer;

/* JADX INFO: loaded from: classes3.dex */
final class Const {
    static final java.lang.String BINARY_BUSYBOX = "busybox";
    static final java.lang.String BINARY_SU = "su";
    static final java.lang.String[] knownRootAppsPackages = {"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot"};
    public static final java.lang.String[] knownDangerousAppsPackages = {"com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "com.android.vending.billing.InAppBillingService.COIN", "com.android.vending.billing.InAppBillingService.LUCK", "com.chelpus.luckypatcher", "com.blackmartalpha", "org.blackmart.market", "com.allinone.free", "com.repodroid.app", "org.creeplays.hack", "com.baseappfull.fwd", "com.zmapp", "com.dv.marketmod.installer", "org.mobilism.android", "com.android.wp.net.log", "com.android.camera.update", "cc.madkite.freedom", "com.solohsu.android.edxp.manager", "org.meowcat.edxposed.manager", "com.xmodgame", "com.cih.game_cih", "com.charles.lpoqasert", "catch_.me_.if_.you_.can_"};
    public static final java.lang.String[] knownRootCloakingPackages = {"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "de.robv.android.xposed.installer", "com.saurik.substrate", "com.zachspong.temprootremovejb", "com.amphoras.hidemyroot", "com.amphoras.hidemyrootadfree", "com.formyhm.hiderootPremium", "com.formyhm.hideroot"};
    private static final java.lang.String[] suPaths = {"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache/", "/data/", "/dev/"};
    static final java.lang.String[] pathsThatShouldNotBeWritable = {"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"};

    private Const() throws java.lang.InstantiationException {
        throw new java.lang.InstantiationException("This class is not for instantiation");
    }

    static java.lang.String[] getPaths() {
        java.util.ArrayList arrayList = new java.util.ArrayList(java.util.Arrays.asList(suPaths));
        java.lang.String str = java.lang.System.getenv(com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.ENVIRONMENT_VARIABLE_PATH);
        if (str == null || "".equals(str)) {
            return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        }
        java.lang.String[] strArrSplit = str.split(":");
        int length = strArrSplit.length;
        for (int i = 0; i < length; i++) {
            java.lang.String str2 = strArrSplit[i];
            if (!str2.endsWith("/")) {
                str2 = str2 + '/';
            }
            if (!arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }
}
