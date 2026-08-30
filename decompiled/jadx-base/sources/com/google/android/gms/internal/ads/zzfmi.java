package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfmi extends android.content.BroadcastReceiver {
    zzfmi() {
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
            int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
            if (intExtra == 0) {
                com.google.android.gms.internal.ads.zzfmj.zza = 1;
            } else if (intExtra == 1) {
                com.google.android.gms.internal.ads.zzfmj.zza = 2;
            }
        }
    }
}
