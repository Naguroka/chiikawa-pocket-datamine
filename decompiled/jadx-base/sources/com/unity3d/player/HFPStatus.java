package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
public class HFPStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private android.content.Context f3869a;
    private android.media.AudioManager d;
    private android.content.BroadcastReceiver b = null;
    private boolean c = false;
    private boolean e = false;
    private int f = 1;

    public HFPStatus(android.content.Context context) {
        this.d = null;
        this.f3869a = context;
        this.d = (android.media.AudioManager) context.getSystemService("audio");
        initHFPStatusJni();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.e) {
            this.e = false;
            this.d.stopBluetoothSco();
        }
    }

    private final native void deinitHFPStatusJni();

    private final native void initHFPStatusJni();

    public final void b() {
        clearHFPStat();
        deinitHFPStatusJni();
    }

    protected void clearHFPStat() {
        android.content.BroadcastReceiver broadcastReceiver = this.b;
        if (broadcastReceiver != null) {
            this.f3869a.unregisterReceiver(broadcastReceiver);
            this.b = null;
        }
        this.f = 1;
        a();
    }

    protected boolean getHFPStat() {
        return this.f == 2;
    }

    protected void requestHFPStat() {
        clearHFPStat();
        android.content.BroadcastReceiver broadcastReceiver = new android.content.BroadcastReceiver() { // from class: com.unity3d.player.HFPStatus.1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(android.content.Context context, android.content.Intent intent) {
                if (intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1) != 1) {
                    return;
                }
                com.unity3d.player.HFPStatus hFPStatus = com.unity3d.player.HFPStatus.this;
                hFPStatus.f = 2;
                hFPStatus.a();
                com.unity3d.player.HFPStatus hFPStatus2 = com.unity3d.player.HFPStatus.this;
                if (hFPStatus2.c) {
                    hFPStatus2.d.setMode(3);
                }
            }
        };
        this.b = broadcastReceiver;
        this.f3869a.registerReceiver(broadcastReceiver, new android.content.IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
        try {
            this.e = true;
            this.d.startBluetoothSco();
        } catch (java.lang.NullPointerException unused) {
            com.unity3d.player.AbstractC1749z.Log(5, "startBluetoothSco() failed. no bluetooth device connected.");
        }
    }

    protected void setHFPRecordingStat(boolean z) {
        this.c = z;
        if (z) {
            return;
        }
        this.d.setMode(0);
    }
}
