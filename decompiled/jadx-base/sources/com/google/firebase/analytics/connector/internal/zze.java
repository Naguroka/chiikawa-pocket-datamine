package com.google.firebase.analytics.connector.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zze implements com.google.firebase.analytics.connector.internal.zza {
    final java.util.Set zza;
    private final com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener zzb;
    private final com.google.android.gms.measurement.api.AppMeasurementSdk zzc;
    private final com.google.firebase.analytics.connector.internal.zzd zzd;

    public zze(com.google.android.gms.measurement.api.AppMeasurementSdk appMeasurementSdk, com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener analyticsConnectorListener) {
        this.zzb = analyticsConnectorListener;
        this.zzc = appMeasurementSdk;
        com.google.firebase.analytics.connector.internal.zzd zzdVar = new com.google.firebase.analytics.connector.internal.zzd(this);
        this.zzd = zzdVar;
        appMeasurementSdk.registerOnMeasurementEventListener(zzdVar);
        this.zza = new java.util.HashSet();
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener zza() {
        return this.zzb;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b A[EDGE_INSN: B:10:0x002b->B:28:0x0060 BREAK  A[LOOP:2: B:20:0x004a->B:26:0x0059]] */
    /* JADX WARN: Code duplicated, block: B:21:0x004c  */
    /* JADX WARN: Code duplicated, block: B:61:0x005f A[SYNTHETIC] */
    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzb(java.util.Set set) {
        int length;
        int iCharCount;
        boolean z;
        int iCodePointAt;
        java.util.Set set2 = this.zza;
        set2.clear();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            if (hashSet.size() >= 50) {
                break;
            }
            int i = com.google.firebase.analytics.connector.internal.zzc.zza;
            if (str == null || str.length() == 0) {
                z = false;
                break;
            }
            int iCodePointAt2 = str.codePointAt(0);
            if (java.lang.Character.isLetter(iCodePointAt2)) {
                length = str.length();
                iCharCount = java.lang.Character.charCount(iCodePointAt2);
                while (true) {
                    if (iCharCount < length) {
                        iCodePointAt = str.codePointAt(iCharCount);
                        if (iCodePointAt == 95 && !java.lang.Character.isLetterOrDigit(iCodePointAt)) {
                            z = false;
                            break;
                        }
                        iCharCount += java.lang.Character.charCount(iCodePointAt);
                    } else {
                        z = true;
                        break;
                    }
                }
            } else {
                if (iCodePointAt2 != 95) {
                    z = false;
                    break;
                }
                iCodePointAt2 = 95;
                length = str.length();
                iCharCount = java.lang.Character.charCount(iCodePointAt2);
                while (true) {
                    if (iCharCount < length) {
                        z = true;
                        break;
                    } else {
                        iCodePointAt = str.codePointAt(iCharCount);
                        if (iCodePointAt == 95) {
                        }
                        iCharCount += java.lang.Character.charCount(iCodePointAt);
                    }
                }
            }
            if (z && str.length() != 0) {
                int iCodePointAt3 = str.codePointAt(0);
                if (java.lang.Character.isLetter(iCodePointAt3)) {
                    int length2 = str.length();
                    int iCharCount2 = java.lang.Character.charCount(iCodePointAt3);
                    while (true) {
                        if (iCharCount2 < length2) {
                            int iCodePointAt4 = str.codePointAt(iCharCount2);
                            if (iCodePointAt4 != 95 && !java.lang.Character.isLetterOrDigit(iCodePointAt4)) {
                                break;
                            } else {
                                iCharCount2 += java.lang.Character.charCount(iCodePointAt4);
                            }
                        } else {
                            java.lang.String strZzb = com.google.android.gms.measurement.internal.zzjy.zzb(str);
                            if (strZzb != null) {
                                str = strZzb;
                            }
                            com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
                            hashSet.add(str);
                            break;
                        }
                    }
                }
            }
        }
        set2.addAll(hashSet);
    }

    @Override // com.google.firebase.analytics.connector.internal.zza
    public final void zzc() {
        this.zza.clear();
    }
}
