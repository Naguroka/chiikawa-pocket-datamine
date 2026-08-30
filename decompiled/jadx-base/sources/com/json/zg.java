package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class zg {

    public enum a {
        None,
        Device,
        Controller
    }

    public enum b {
        None,
        Loading,
        Loaded,
        Ready,
        Failed
    }

    public enum c {
        Web,
        Native,
        None
    }

    public enum d {
        MODE_0(0),
        MODE_1(1),
        MODE_2(2),
        MODE_3(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f3616a;

        d(int i) {
            this.f3616a = i;
        }

        public int a() {
            return this.f3616a;
        }
    }

    public enum e {
        Banner,
        Interstitial,
        RewardedVideo,
        NativeAd,
        None
    }
}
