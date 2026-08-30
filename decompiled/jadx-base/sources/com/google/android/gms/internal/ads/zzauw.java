package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzauw implements com.google.android.gms.internal.ads.zzauv {
    protected static volatile com.google.android.gms.internal.ads.zzawd zza;
    protected android.view.MotionEvent zzb;
    protected double zzk;
    protected float zzl;
    protected float zzm;
    protected float zzn;
    protected float zzo;
    protected android.util.DisplayMetrics zzq;
    protected com.google.android.gms.internal.ads.zzavv zzr;
    private double zzs;
    private double zzt;
    protected final java.util.LinkedList zzc = new java.util.LinkedList();
    protected long zzd = 0;
    protected long zze = 0;
    protected long zzf = 0;
    protected long zzg = 0;
    protected long zzh = 0;
    protected long zzi = 0;
    protected long zzj = 0;
    private boolean zzu = false;
    protected boolean zzp = false;

    protected zzauw(android.content.Context context) {
        try {
            com.google.android.gms.internal.ads.zzaty.zze();
            this.zzq = context.getResources().getDisplayMetrics();
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcT)).booleanValue()) {
                this.zzr = new com.google.android.gms.internal.ads.zzavv();
            }
        } catch (java.lang.Throwable unused) {
        }
    }

    private final void zzm() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        if (this.zzc.isEmpty()) {
            android.view.MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            java.util.Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                ((android.view.MotionEvent) it.next()).recycle();
            }
            this.zzc.clear();
        }
        this.zzb = null;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3 A[Catch: Exception -> 0x00ed, TryCatch #0 {Exception -> 0x00ed, blocks: (B:45:0x00a6, B:48:0x00b3, B:57:0x00d7, B:58:0x00e7), top: B:73:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e7 A[Catch: Exception -> 0x00ed, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ed, blocks: (B:45:0x00a6, B:48:0x00b3, B:57:0x00d7, B:58:0x00e7), top: B:73:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final java.lang.String zzp(android.content.Context context, java.lang.String str, int i, android.view.View view, android.app.Activity activity, byte[] bArr) {
        com.google.android.gms.internal.ads.zzauu zzauuVarZzd;
        java.lang.String str2;
        int i2;
        java.lang.Exception exc;
        int i3;
        int i4;
        long jCurrentTimeMillis;
        java.lang.String strZzb;
        int i5;
        int i6;
        com.google.android.gms.internal.ads.zzasc zzascVarZzc;
        int i7;
        int i8;
        int i9 = i;
        long jCurrentTimeMillis2 = java.lang.System.currentTimeMillis();
        boolean zBooleanValue = ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcG)).booleanValue();
        com.google.android.gms.internal.ads.zzasc zzascVarZzb = null;
        if (zBooleanValue) {
            zzauuVarZzd = zza != null ? zza.zzd() : null;
            str2 = "be";
        } else {
            zzauuVarZzd = null;
            str2 = null;
        }
        int i10 = 1;
        try {
            if (i9 == 3) {
                zzascVarZzb = zzb(context, view, activity);
                try {
                    this.zzu = true;
                    i8 = 1002;
                } catch (java.lang.Exception e) {
                    exc = e;
                    i2 = 3;
                    i10 = 1;
                    if (!zBooleanValue) {
                    }
                    jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    if (zzascVarZzb != null) {
                        try {
                            if (((com.google.android.gms.internal.ads.zzasy) zzascVarZzb.zzbr()).zzaY() == 0) {
                                strZzb = java.lang.Integer.toString(5);
                            } else {
                                com.google.android.gms.internal.ads.zzasy zzasyVar = (com.google.android.gms.internal.ads.zzasy) zzascVarZzb.zzbr();
                                int i11 = com.google.android.gms.internal.ads.zzaty.zzc;
                                strZzb = com.google.android.gms.internal.ads.zzaty.zzb(zzasyVar.zzaV(), str);
                                if (zBooleanValue) {
                                    if (i9 == i2) {
                                        i5 = 1006;
                                    } else if (i9 == i3) {
                                        i5 = 1010;
                                    } else {
                                        i5 = 1004;
                                    }
                                    zzauuVarZzd.zzc(i5, -1, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                                }
                            }
                        } catch (java.lang.Exception e2) {
                            strZzb = java.lang.Integer.toString(7);
                            if (zBooleanValue && zzauuVarZzd != null) {
                                if (i9 == i2) {
                                    i6 = 1007;
                                } else {
                                    i6 = i9 == i3 ? 1011 : 1005;
                                }
                                zzauuVarZzd.zzc(i6, -1, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, str2, e2);
                            }
                        }
                    } else {
                        strZzb = java.lang.Integer.toString(5);
                    }
                    return strZzb;
                }
            } else {
                if (i9 == 2) {
                    zzascVarZzc = zzi(context, view, activity);
                    i7 = 1008;
                } else {
                    zzascVarZzc = zzc(context, null);
                    i7 = 1000;
                }
                zzascVarZzb = zzascVarZzc;
                i8 = i7;
            }
            if (!zBooleanValue || zzauuVarZzd == null) {
                i2 = 3;
            } else {
                i2 = 3;
                try {
                    zzauuVarZzd.zzc(i8, -1, java.lang.System.currentTimeMillis() - jCurrentTimeMillis2, str2, null);
                } catch (java.lang.Exception e3) {
                    e = e3;
                    exc = e;
                    if (!zBooleanValue && zzauuVarZzd != null) {
                        if (i9 == i2) {
                            i4 = 1003;
                            i3 = 2;
                        } else {
                            i3 = 2;
                            if (i9 == 2) {
                                i4 = 1009;
                            } else {
                                i4 = 1001;
                                i9 = i10;
                            }
                        }
                        zzauuVarZzd.zzc(i4, -1, java.lang.System.currentTimeMillis() - jCurrentTimeMillis2, str2, exc);
                    }
                    jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                    if (zzascVarZzb != null) {
                        strZzb = java.lang.Integer.toString(5);
                    } else if (((com.google.android.gms.internal.ads.zzasy) zzascVarZzb.zzbr()).zzaY() == 0) {
                        strZzb = java.lang.Integer.toString(5);
                    } else {
                        com.google.android.gms.internal.ads.zzasy zzasyVar2 = (com.google.android.gms.internal.ads.zzasy) zzascVarZzb.zzbr();
                        int i12 = com.google.android.gms.internal.ads.zzaty.zzc;
                        strZzb = com.google.android.gms.internal.ads.zzaty.zzb(zzasyVar2.zzaV(), str);
                        if (zBooleanValue) {
                            if (i9 == i2) {
                                i5 = 1006;
                            } else if (i9 == i3) {
                                i5 = 1010;
                            } else {
                                i5 = 1004;
                            }
                            zzauuVarZzd.zzc(i5, -1, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                        }
                    }
                    return strZzb;
                }
            }
        } catch (java.lang.Exception e4) {
            e = e4;
            i2 = 3;
        }
        i3 = 2;
        jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        if (zzascVarZzb != null) {
            strZzb = java.lang.Integer.toString(5);
        } else if (((com.google.android.gms.internal.ads.zzasy) zzascVarZzb.zzbr()).zzaY() == 0) {
            strZzb = java.lang.Integer.toString(5);
        } else {
            com.google.android.gms.internal.ads.zzasy zzasyVar3 = (com.google.android.gms.internal.ads.zzasy) zzascVarZzb.zzbr();
            int i13 = com.google.android.gms.internal.ads.zzaty.zzc;
            strZzb = com.google.android.gms.internal.ads.zzaty.zzb(zzasyVar3.zzaV(), str);
            if (zBooleanValue && zzauuVarZzd != null) {
                if (i9 == i2) {
                    i5 = 1006;
                } else if (i9 == i3) {
                    i5 = 1010;
                } else {
                    i5 = 1004;
                }
                zzauuVarZzd.zzc(i5, -1, java.lang.System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
            }
        }
        return strZzb;
    }

    protected abstract long zza(java.lang.StackTraceElement[] stackTraceElementArr) throws com.google.android.gms.internal.ads.zzavt;

    protected abstract com.google.android.gms.internal.ads.zzasc zzb(android.content.Context context, android.view.View view, android.app.Activity activity);

    protected abstract com.google.android.gms.internal.ads.zzasc zzc(android.content.Context context, com.google.android.gms.internal.ads.zzarp zzarpVar);

    @Override // com.google.android.gms.internal.ads.zzauv
    public final java.lang.String zzd(android.content.Context context, java.lang.String str, android.view.View view) {
        return zzp(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final java.lang.String zze(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        return zzp(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final java.lang.String zzf(android.content.Context context) {
        if (com.google.android.gms.internal.ads.zzawg.zzc()) {
            throw new java.lang.IllegalStateException("The caller must not be called from the UI thread.");
        }
        return zzp(context, null, 1, null, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final java.lang.String zzg(android.content.Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final java.lang.String zzh(android.content.Context context, android.view.View view, android.app.Activity activity) {
        return zzp(context, null, 2, view, activity, null);
    }

    protected abstract com.google.android.gms.internal.ads.zzasc zzi(android.content.Context context, android.view.View view, android.app.Activity activity);

    protected abstract com.google.android.gms.internal.ads.zzawf zzj(android.view.MotionEvent motionEvent) throws com.google.android.gms.internal.ads.zzavt;

    @Override // com.google.android.gms.internal.ads.zzauv
    public final synchronized void zzk(android.view.MotionEvent motionEvent) {
        java.lang.Long l;
        if (this.zzu) {
            zzm();
            this.zzu = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zzk = 0.0d;
            this.zzs = motionEvent.getRawX();
            this.zzt = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d = rawX - this.zzs;
            double d2 = rawY - this.zzt;
            this.zzk += java.lang.Math.sqrt((d * d) + (d2 * d2));
            this.zzs = rawX;
            this.zzt = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(motionEvent);
                    this.zzb = motionEventObtain;
                    this.zzc.add(motionEventObtain);
                    if (this.zzc.size() > 6) {
                        ((android.view.MotionEvent) this.zzc.remove()).recycle();
                    }
                    this.zzf++;
                    this.zzh = zza(new java.lang.Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.zze += (long) (motionEvent.getHistorySize() + 1);
                    com.google.android.gms.internal.ads.zzawf zzawfVarZzj = zzj(motionEvent);
                    java.lang.Long l2 = zzawfVarZzj.zzd;
                    if (l2 != null && zzawfVarZzj.zzg != null) {
                        this.zzi += l2.longValue() + zzawfVarZzj.zzg.longValue();
                    }
                    if (this.zzq != null && (l = zzawfVarZzj.zze) != null && zzawfVarZzj.zzh != null) {
                        this.zzj += l.longValue() + zzawfVarZzj.zzh.longValue();
                    }
                } else if (action2 == 3) {
                    this.zzg++;
                }
            } catch (com.google.android.gms.internal.ads.zzavt unused) {
            }
        } else {
            this.zzl = motionEvent.getX();
            this.zzm = motionEvent.getY();
            this.zzn = motionEvent.getRawX();
            this.zzo = motionEvent.getRawY();
            this.zzd++;
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final synchronized void zzl(int i, int i2, int i3) {
        if (this.zzb != null) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcE)).booleanValue()) {
                zzm();
            } else {
                this.zzb.recycle();
            }
        }
        android.util.DisplayMetrics displayMetrics = this.zzq;
        if (displayMetrics != null) {
            this.zzb = android.view.MotionEvent.obtain(0L, i3, 1, i * displayMetrics.density, this.zzq.density * i2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.zzb = null;
        }
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzn(java.lang.StackTraceElement[] stackTraceElementArr) {
        com.google.android.gms.internal.ads.zzavv zzavvVar;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcl.zzcT)).booleanValue() || (zzavvVar = this.zzr) == null) {
            return;
        }
        zzavvVar.zzb(java.util.Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public void zzo(android.view.View view) {
    }
}
