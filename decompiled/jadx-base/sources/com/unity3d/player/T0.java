package com.unity3d.player;

/* JADX INFO: loaded from: classes6.dex */
final class T0 implements android.os.Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.unity3d.player.U0 f3895a;

    T0(com.unity3d.player.U0 u0) {
        this.f3895a = u0;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00e1 A[PHI: r7
  0x00e1: PHI (r7v11 com.unity3d.player.U0) = (r7v7 com.unity3d.player.U0), (r7v14 com.unity3d.player.U0) binds: [B:58:0x00df, B:47:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message message) {
        com.unity3d.player.U0 u0;
        if (message.what != 2269) {
            return false;
        }
        com.unity3d.player.S0 s0 = (com.unity3d.player.S0) message.obj;
        com.unity3d.player.S0 s1 = com.unity3d.player.S0.h;
        if (s0 == s1) {
            com.unity3d.player.U0 u1 = this.f3895a;
            u1.e--;
            u1.i.executeGLThreadJobs();
            com.unity3d.player.U0 u2 = this.f3895a;
            if (!u2.b) {
                return true;
            }
            if (u2.i.getHaveAndroidWindowSupport() && !this.f3895a.c) {
                return true;
            }
            com.unity3d.player.U0 u3 = this.f3895a;
            int i = u3.h;
            if (i >= 0) {
                if (i == 0) {
                    if (u3.i.getSplashEnabled()) {
                        this.f3895a.i.DisableStaticSplashScreen();
                    }
                    com.unity3d.player.UnityPlayer unityPlayer = this.f3895a.i;
                    if (unityPlayer.mActivity != null && unityPlayer.getAutoReportFullyDrawnEnabled()) {
                        this.f3895a.i.mActivity.reportFullyDrawn();
                    }
                }
                this.f3895a.h--;
            }
            if (!this.f3895a.i.isFinishing() && !this.f3895a.i.nativeRender()) {
                this.f3895a.i.finish();
            }
        } else if (s0 == com.unity3d.player.S0.c) {
            android.os.Looper.myLooper().quit();
        } else if (s0 == com.unity3d.player.S0.b) {
            this.f3895a.b = true;
        } else if (s0 == com.unity3d.player.S0.f3893a) {
            this.f3895a.b = false;
        } else if (s0 == com.unity3d.player.S0.d) {
            this.f3895a.c = false;
        } else if (s0 == com.unity3d.player.S0.e) {
            u0 = this.f3895a;
            u0.c = true;
            if (u0.d == 3) {
                u0.i.nativeFocusChanged(true);
                this.f3895a.d = 1;
            }
        } else if (s0 == com.unity3d.player.S0.f) {
            com.unity3d.player.U0 u4 = this.f3895a;
            if (u4.d == 1) {
                u4.i.nativeFocusChanged(false);
            }
            this.f3895a.d = 2;
        } else if (s0 == com.unity3d.player.S0.g) {
            u0 = this.f3895a;
            u0.d = 3;
            if (u0.c) {
                u0.i.nativeFocusChanged(true);
                this.f3895a.d = 1;
            }
        } else if (s0 == com.unity3d.player.S0.i) {
            com.unity3d.player.UnityPlayer unityPlayer2 = this.f3895a.i;
            unityPlayer2.nativeSetLaunchURL(unityPlayer2.getLaunchURL());
        } else if (s0 == com.unity3d.player.S0.j) {
            com.unity3d.player.U0 u5 = this.f3895a;
            u5.i.nativeOrientationChanged(u5.f, u5.g);
        }
        com.unity3d.player.U0 u6 = this.f3895a;
        if (u6.b && u6.e <= 0) {
            android.os.Message.obtain(u6.f3897a, 2269, s1).sendToTarget();
            this.f3895a.e++;
        }
        return true;
    }
}
