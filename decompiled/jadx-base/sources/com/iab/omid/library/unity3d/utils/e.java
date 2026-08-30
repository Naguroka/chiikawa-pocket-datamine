package com.iab.omid.library.unity3d.utils;

/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static com.iab.omid.library.unity3d.adsession.OutputDeviceStatus f2476a = com.iab.omid.library.unity3d.adsession.OutputDeviceStatus.UNKNOWN;

    class a extends android.content.BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context context, android.content.Intent intent) {
            com.iab.omid.library.unity3d.adsession.OutputDeviceStatus outputDeviceStatus;
            if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                if (intExtra == 0) {
                    outputDeviceStatus = com.iab.omid.library.unity3d.adsession.OutputDeviceStatus.NOT_DETECTED;
                } else if (intExtra != 1) {
                    return;
                } else {
                    outputDeviceStatus = com.iab.omid.library.unity3d.adsession.OutputDeviceStatus.UNKNOWN;
                }
                com.iab.omid.library.unity3d.adsession.OutputDeviceStatus unused = com.iab.omid.library.unity3d.utils.e.f2476a = outputDeviceStatus;
            }
        }
    }

    public static com.iab.omid.library.unity3d.adsession.OutputDeviceStatus a() {
        return com.iab.omid.library.unity3d.utils.a.a() != com.iab.omid.library.unity3d.adsession.DeviceCategory.CTV ? com.iab.omid.library.unity3d.adsession.OutputDeviceStatus.UNKNOWN : f2476a;
    }

    public static void a(android.content.Context context) {
        context.registerReceiver(new com.iab.omid.library.unity3d.utils.e.a(), new android.content.IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
    }
}
