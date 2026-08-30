package com.iab.omid.library.bytedance2.utils;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.iab.omid.library.bytedance2.adsession.OutputDeviceStatus f2409a = com.iab.omid.library.bytedance2.adsession.OutputDeviceStatus.UNKNOWN;

    class a extends android.content.BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                if (intExtra == 0) {
                    com.iab.omid.library.bytedance2.adsession.OutputDeviceStatus unused = com.iab.omid.library.bytedance2.utils.e.f2409a = com.iab.omid.library.bytedance2.adsession.OutputDeviceStatus.NOT_DETECTED;
                } else if (intExtra == 1) {
                    com.iab.omid.library.bytedance2.adsession.OutputDeviceStatus unused2 = com.iab.omid.library.bytedance2.utils.e.f2409a = com.iab.omid.library.bytedance2.adsession.OutputDeviceStatus.UNKNOWN;
                }
            }
        }
    }

    public static com.iab.omid.library.bytedance2.adsession.OutputDeviceStatus a() {
        return com.iab.omid.library.bytedance2.utils.a.a() != com.iab.omid.library.bytedance2.adsession.DeviceCategory.CTV ? com.iab.omid.library.bytedance2.adsession.OutputDeviceStatus.UNKNOWN : f2409a;
    }

    public static void a(android.content.Context context) {
        context.registerReceiver(new com.iab.omid.library.bytedance2.utils.e.a(), new android.content.IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
