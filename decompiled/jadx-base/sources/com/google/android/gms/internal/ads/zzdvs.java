package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdvs extends com.google.android.gms.ads.internal.client.zzdt {
    final java.util.Map zza = new java.util.HashMap();
    private final android.content.Context zzb;
    private final java.lang.ref.WeakReference zzc;
    private final com.google.android.gms.internal.ads.zzdvg zzd;
    private final com.google.android.gms.internal.ads.zzgcs zze;
    private com.google.android.gms.internal.ads.zzduv zzf;

    zzdvs(android.content.Context context, java.lang.ref.WeakReference weakReference, com.google.android.gms.internal.ads.zzdvg zzdvgVar, com.google.android.gms.internal.ads.zzdvt zzdvtVar, com.google.android.gms.internal.ads.zzgcs zzgcsVar) {
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzdvgVar;
        this.zze = zzgcsVar;
    }

    private final android.content.Context zzj() {
        android.content.Context context = (android.content.Context) this.zzc.get();
        return context == null ? this.zzb : context;
    }

    private static com.google.android.gms.ads.AdRequest zzk() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        return new com.google.android.gms.ads.AdRequest.Builder().addNetworkExtrasBundle(com.google.ads.mediation.admob.AdMobAdapter.class, bundle).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String zzl(java.lang.Object obj) {
        com.google.android.gms.ads.ResponseInfo responseInfo;
        com.google.android.gms.ads.internal.client.zzdy zzdyVarZzc;
        if (obj instanceof com.google.android.gms.ads.LoadAdError) {
            responseInfo = ((com.google.android.gms.ads.LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof com.google.android.gms.ads.appopen.AppOpenAd) {
            responseInfo = ((com.google.android.gms.ads.appopen.AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof com.google.android.gms.ads.interstitial.InterstitialAd) {
            responseInfo = ((com.google.android.gms.ads.interstitial.InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof com.google.android.gms.ads.rewarded.RewardedAd) {
            responseInfo = ((com.google.android.gms.ads.rewarded.RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd) {
            responseInfo = ((com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof com.google.android.gms.ads.AdView) {
            responseInfo = ((com.google.android.gms.ads.AdView) obj).getResponseInfo();
        } else {
            if (!(obj instanceof com.google.android.gms.ads.nativead.NativeAd)) {
                return "";
            }
            responseInfo = ((com.google.android.gms.ads.nativead.NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzdyVarZzc = responseInfo.zzc()) == null) {
            return "";
        }
        try {
            return zzdyVarZzc.zzh();
        } catch (android.os.RemoteException unused) {
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void zzm(java.lang.String str, java.lang.String str2) {
        try {
            com.google.android.gms.internal.ads.zzgch.zzr(this.zzf.zzb(str), new com.google.android.gms.internal.ads.zzdvq(this, str2), this.zze);
        } catch (java.lang.NullPointerException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzk(str2);
        }
    }

    private final synchronized void zzn(java.lang.String str, java.lang.String str2) {
        try {
            com.google.android.gms.internal.ads.zzgch.zzr(this.zzf.zzb(str), new com.google.android.gms.internal.ads.zzdvr(this, str2), this.zze);
        } catch (java.lang.NullPointerException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "OutOfContextTester.setAdAsShown");
            this.zzd.zzk(str2);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdu
    public final void zze(java.lang.String str, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2) {
        android.content.Context context = (android.content.Context) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper2);
        if (context == null || viewGroup == null) {
            return;
        }
        java.lang.Object obj = this.zza.get(str);
        if (obj != null) {
            this.zza.remove(str);
        }
        if (obj instanceof com.google.android.gms.ads.AdView) {
            com.google.android.gms.internal.ads.zzdvt.zza(context, viewGroup, (com.google.android.gms.ads.AdView) obj);
        } else if (obj instanceof com.google.android.gms.ads.nativead.NativeAd) {
            com.google.android.gms.internal.ads.zzdvt.zzb(context, viewGroup, (com.google.android.gms.ads.nativead.NativeAd) obj);
        }
    }

    public final void zzf(com.google.android.gms.internal.ads.zzduv zzduvVar) {
        this.zzf = zzduvVar;
    }

    protected final synchronized void zzg(java.lang.String str, java.lang.Object obj, java.lang.String str2) {
        this.zza.put(str, obj);
        zzm(zzl(obj), str2);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final synchronized void zzh(final java.lang.String str, java.lang.String str2, final java.lang.String str3) {
        byte b;
        switch (str2.hashCode()) {
            case -1999289321:
                if (!str2.equals("NATIVE")) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case -1372958932:
                if (!str2.equals("INTERSTITIAL")) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case -428325382:
                if (!str2.equals("APP_OPEN_AD")) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 543046670:
                if (!str2.equals("REWARDED")) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 1854800829:
                if (!str2.equals("REWARDED_INTERSTITIAL")) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case 1951953708:
                if (!str2.equals(com.json.mediationsdk.l.f2983a)) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            default:
                b = -1;
                break;
        }
        if (b == 0) {
            com.google.android.gms.ads.appopen.AppOpenAd.load(zzj(), str, zzk(), 1, new com.google.android.gms.internal.ads.zzdvk(this, str, str3));
            return;
        }
        if (b == 1) {
            com.google.android.gms.ads.AdView adView = new com.google.android.gms.ads.AdView(zzj());
            adView.setAdSize(com.google.android.gms.ads.AdSize.BANNER);
            adView.setAdUnitId(str);
            adView.setAdListener(new com.google.android.gms.internal.ads.zzdvl(this, str, adView, str3));
            adView.loadAd(zzk());
            return;
        }
        if (b == 2) {
            com.google.android.gms.ads.interstitial.InterstitialAd.load(zzj(), str, zzk(), new com.google.android.gms.internal.ads.zzdvm(this, str, str3));
            return;
        }
        if (b == 3) {
            com.google.android.gms.ads.AdLoader.Builder builder = new com.google.android.gms.ads.AdLoader.Builder(zzj(), str);
            builder.forNativeAd(new com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener() { // from class: com.google.android.gms.internal.ads.zzdvh
                @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
                public final void onNativeAdLoaded(com.google.android.gms.ads.nativead.NativeAd nativeAd) {
                    this.zza.zzg(str, nativeAd, str3);
                }
            });
            builder.withAdListener(new com.google.android.gms.internal.ads.zzdvp(this, str3));
            builder.build().loadAd(zzk());
            return;
        }
        if (b == 4) {
            com.google.android.gms.ads.rewarded.RewardedAd.load(zzj(), str, zzk(), new com.google.android.gms.internal.ads.zzdvn(this, str, str3));
        } else {
            if (b != 5) {
                return;
            }
            com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd.load(zzj(), str, zzk(), new com.google.android.gms.internal.ads.zzdvo(this, str, str3));
        }
    }

    public final synchronized void zzi(java.lang.String str, java.lang.String str2) {
        java.lang.Object obj;
        android.app.Activity activityZzg = this.zzd.zzg();
        if (activityZzg != null && (obj = this.zza.get(str)) != null) {
            if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjm)).booleanValue() || (obj instanceof com.google.android.gms.ads.appopen.AppOpenAd) || (obj instanceof com.google.android.gms.ads.interstitial.InterstitialAd) || (obj instanceof com.google.android.gms.ads.rewarded.RewardedAd) || (obj instanceof com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd)) {
                this.zza.remove(str);
            }
            zzn(zzl(obj), str2);
            if (obj instanceof com.google.android.gms.ads.appopen.AppOpenAd) {
                ((com.google.android.gms.ads.appopen.AppOpenAd) obj).show(activityZzg);
                return;
            }
            if (obj instanceof com.google.android.gms.ads.interstitial.InterstitialAd) {
                ((com.google.android.gms.ads.interstitial.InterstitialAd) obj).show(activityZzg);
                return;
            }
            if (obj instanceof com.google.android.gms.ads.rewarded.RewardedAd) {
                ((com.google.android.gms.ads.rewarded.RewardedAd) obj).show(activityZzg, new com.google.android.gms.ads.OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzdvi
                    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                    public final void onUserEarnedReward(com.google.android.gms.ads.rewarded.RewardItem rewardItem) {
                    }
                });
                return;
            }
            if (obj instanceof com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd) {
                ((com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd) obj).show(activityZzg, new com.google.android.gms.ads.OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzdvj
                    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                    public final void onUserEarnedReward(com.google.android.gms.ads.rewarded.RewardItem rewardItem) {
                    }
                });
                return;
            }
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzjm)).booleanValue() && ((obj instanceof com.google.android.gms.ads.AdView) || (obj instanceof com.google.android.gms.ads.nativead.NativeAd))) {
                android.content.Intent intent = new android.content.Intent();
                android.content.Context contextZzj = zzj();
                intent.setClassName(contextZzj, com.google.android.gms.ads.OutOfContextTestingActivity.CLASS_NAME);
                intent.putExtra("adUnit", str);
                com.google.android.gms.ads.internal.zzv.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzT(contextZzj, intent);
            }
        }
    }
}
