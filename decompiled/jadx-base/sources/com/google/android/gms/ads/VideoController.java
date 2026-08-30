package com.google.android.gms.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class VideoController {
    public static final int PLAYBACK_STATE_ENDED = 3;
    public static final int PLAYBACK_STATE_PAUSED = 2;
    public static final int PLAYBACK_STATE_PLAYING = 1;
    public static final int PLAYBACK_STATE_READY = 5;
    public static final int PLAYBACK_STATE_UNKNOWN = 0;
    private final java.lang.Object zza = new java.lang.Object();
    private com.google.android.gms.ads.internal.client.zzeb zzb;
    private com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks zzc;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    public static abstract class VideoLifecycleCallbacks {
        public void onVideoEnd() {
        }

        public void onVideoMute(boolean z) {
        }

        public void onVideoPause() {
        }

        public void onVideoPlay() {
        }

        public void onVideoStart() {
        }
    }

    public com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks getVideoLifecycleCallbacks() {
        com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks;
        synchronized (this.zza) {
            videoLifecycleCallbacks = this.zzc;
        }
        return videoLifecycleCallbacks;
    }

    public boolean hasVideoContent() {
        boolean z;
        synchronized (this.zza) {
            z = this.zzb != null;
        }
        return z;
    }

    public final com.google.android.gms.ads.internal.client.zzeb zza() {
        com.google.android.gms.ads.internal.client.zzeb zzebVar;
        synchronized (this.zza) {
            zzebVar = this.zzb;
        }
        return zzebVar;
    }

    public final void zzb(com.google.android.gms.ads.internal.client.zzeb zzebVar) {
        synchronized (this.zza) {
            this.zzb = zzebVar;
            com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks = this.zzc;
            if (videoLifecycleCallbacks != null) {
                setVideoLifecycleCallbacks(videoLifecycleCallbacks);
            }
        }
    }

    public int getPlaybackState() {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return 0;
            }
            try {
                return zzebVar.zzh();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call getPlaybackState on video controller.", e);
                return 0;
            }
        }
    }

    public boolean isClickToExpandEnabled() {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return false;
            }
            try {
                return zzebVar.zzo();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call isClickToExpandEnabled.", e);
                return false;
            }
        }
    }

    public boolean isCustomControlsEnabled() {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return false;
            }
            try {
                return zzebVar.zzp();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call isUsingCustomPlayerControls.", e);
                return false;
            }
        }
    }

    public boolean isMuted() {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return true;
            }
            try {
                return zzebVar.zzq();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call isMuted on video controller.", e);
                return true;
            }
        }
    }

    public void mute(boolean z) {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return;
            }
            try {
                zzebVar.zzj(z);
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call mute on video controller.", e);
            }
        }
    }

    public void pause() {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return;
            }
            try {
                zzebVar.zzk();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call pause on video controller.", e);
            }
        }
    }

    public void play() {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return;
            }
            try {
                zzebVar.zzl();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call play on video controller.", e);
            }
        }
    }

    public void stop() {
        synchronized (this.zza) {
            com.google.android.gms.ads.internal.client.zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return;
            }
            try {
                zzebVar.zzn();
            } catch (android.os.RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call stop on video controller.", e);
            }
        }
    }

    public void setVideoLifecycleCallbacks(com.google.android.gms.ads.VideoController.VideoLifecycleCallbacks videoLifecycleCallbacks) {
        com.google.android.gms.ads.internal.client.zzfz zzfzVar;
        synchronized (this.zza) {
            this.zzc = videoLifecycleCallbacks;
            com.google.android.gms.ads.internal.client.zzeb zzebVar = this.zzb;
            if (zzebVar == null) {
                return;
            }
            if (videoLifecycleCallbacks == null) {
                zzfzVar = null;
            } else {
                try {
                    zzfzVar = new com.google.android.gms.ads.internal.client.zzfz(videoLifecycleCallbacks);
                } catch (android.os.RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to call setVideoLifecycleCallbacks on video controller.", e);
                }
            }
            zzebVar.zzm(zzfzVar);
        }
    }
}
