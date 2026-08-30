package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzoc implements com.google.android.gms.internal.ads.zzlw, com.google.android.gms.internal.ads.zzod {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzoe zzb;
    private final android.media.metrics.PlaybackSession zzc;
    private java.lang.String zzi;
    private android.media.metrics.PlaybackMetrics.Builder zzj;
    private int zzk;
    private com.google.android.gms.internal.ads.zzbd zzn;
    private com.google.android.gms.internal.ads.zzob zzo;
    private com.google.android.gms.internal.ads.zzob zzp;
    private com.google.android.gms.internal.ads.zzob zzq;
    private com.google.android.gms.internal.ads.zzab zzr;
    private com.google.android.gms.internal.ads.zzab zzs;
    private com.google.android.gms.internal.ads.zzab zzt;
    private boolean zzu;
    private boolean zzv;
    private int zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;
    private final com.google.android.gms.internal.ads.zzbp zze = new com.google.android.gms.internal.ads.zzbp();
    private final com.google.android.gms.internal.ads.zzbo zzf = new com.google.android.gms.internal.ads.zzbo();
    private final java.util.HashMap zzh = new java.util.HashMap();
    private final java.util.HashMap zzg = new java.util.HashMap();
    private final long zzd = android.os.SystemClock.elapsedRealtime();
    private int zzl = 0;
    private int zzm = 0;

    private zzoc(android.content.Context context, android.media.metrics.PlaybackSession playbackSession) {
        this.zza = context.getApplicationContext();
        this.zzc = playbackSession;
        com.google.android.gms.internal.ads.zzoa zzoaVar = new com.google.android.gms.internal.ads.zzoa(com.google.android.gms.internal.ads.zzoa.zza);
        this.zzb = zzoaVar;
        zzoaVar.zzh(this);
    }

    public static com.google.android.gms.internal.ads.zzoc zzb(android.content.Context context) {
        android.media.metrics.MediaMetricsManager mediaMetricsManager = (android.media.metrics.MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new com.google.android.gms.internal.ads.zzoc(context, mediaMetricsManager.createPlaybackSession());
    }

    private static int zzr(int i) {
        switch (com.google.android.gms.internal.ads.zzei.zzl(i)) {
            case 6002:
                return 24;
            case 6003:
                return 28;
            case androidx.media3.common.PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED /* 6004 */:
                return 25;
            case androidx.media3.common.PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION /* 6005 */:
                return 26;
            default:
                return 27;
        }
    }

    private final void zzs() {
        android.media.metrics.PlaybackMetrics.Builder builder = this.zzj;
        if (builder != null && this.zzz) {
            builder.setAudioUnderrunCount(this.zzy);
            this.zzj.setVideoFramesDropped(this.zzw);
            this.zzj.setVideoFramesPlayed(this.zzx);
            java.lang.Long l = (java.lang.Long) this.zzg.get(this.zzi);
            this.zzj.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            java.lang.Long l2 = (java.lang.Long) this.zzh.get(this.zzi);
            this.zzj.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.zzj.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.zzc.reportPlaybackMetrics(this.zzj.build());
        }
        this.zzj = null;
        this.zzi = null;
        this.zzy = 0;
        this.zzw = 0;
        this.zzx = 0;
        this.zzr = null;
        this.zzs = null;
        this.zzt = null;
        this.zzz = false;
    }

    private final void zzt(long j, com.google.android.gms.internal.ads.zzab zzabVar, int i) {
        if (java.util.Objects.equals(this.zzs, zzabVar)) {
            return;
        }
        int i2 = this.zzs == null ? 1 : 0;
        this.zzs = zzabVar;
        zzx(0, j, zzabVar, i2);
    }

    private final void zzu(long j, com.google.android.gms.internal.ads.zzab zzabVar, int i) {
        if (java.util.Objects.equals(this.zzt, zzabVar)) {
            return;
        }
        int i2 = this.zzt == null ? 1 : 0;
        this.zzt = zzabVar;
        zzx(2, j, zzabVar, i2);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"metricsBuilder"})
    private final void zzv(com.google.android.gms.internal.ads.zzbq zzbqVar, com.google.android.gms.internal.ads.zzug zzugVar) {
        int iZza;
        android.media.metrics.PlaybackMetrics.Builder builder = this.zzj;
        if (zzugVar == null || (iZza = zzbqVar.zza(zzugVar.zza)) == -1) {
            return;
        }
        int i = 0;
        zzbqVar.zzd(iZza, this.zzf, false);
        zzbqVar.zze(this.zzf.zzc, this.zze, 0L);
        com.google.android.gms.internal.ads.zzam zzamVar = this.zze.zzd.zzb;
        if (zzamVar != null) {
            int iZzo = com.google.android.gms.internal.ads.zzei.zzo(zzamVar.zza);
            if (iZzo == 0) {
                i = 3;
            } else if (iZzo != 1) {
                i = iZzo != 2 ? 1 : 4;
            } else {
                i = 5;
            }
        }
        builder.setStreamType(i);
        com.google.android.gms.internal.ads.zzbp zzbpVar = this.zze;
        long j = zzbpVar.zzm;
        if (j != androidx.media3.common.C.TIME_UNSET && !zzbpVar.zzk && !zzbpVar.zzi && !zzbpVar.zzb()) {
            builder.setMediaDurationMillis(com.google.android.gms.internal.ads.zzei.zzv(j));
        }
        builder.setPlaybackType(true != this.zze.zzb() ? 1 : 2);
        this.zzz = true;
    }

    private final void zzw(long j, com.google.android.gms.internal.ads.zzab zzabVar, int i) {
        if (java.util.Objects.equals(this.zzr, zzabVar)) {
            return;
        }
        int i2 = this.zzr == null ? 1 : 0;
        this.zzr = zzabVar;
        zzx(1, j, zzabVar, i2);
    }

    private final void zzx(int i, long j, com.google.android.gms.internal.ads.zzab zzabVar, int i2) {
        android.media.metrics.TrackChangeEvent.Builder timeSinceCreatedMillis = new android.media.metrics.TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.zzd);
        if (zzabVar != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(i2 != 1 ? 1 : 2);
            java.lang.String str = zzabVar.zzn;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            java.lang.String str2 = zzabVar.zzo;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            java.lang.String str3 = zzabVar.zzk;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i3 = zzabVar.zzj;
            if (i3 != -1) {
                timeSinceCreatedMillis.setBitrate(i3);
            }
            int i4 = zzabVar.zzv;
            if (i4 != -1) {
                timeSinceCreatedMillis.setWidth(i4);
            }
            int i5 = zzabVar.zzw;
            if (i5 != -1) {
                timeSinceCreatedMillis.setHeight(i5);
            }
            int i6 = zzabVar.zzD;
            if (i6 != -1) {
                timeSinceCreatedMillis.setChannelCount(i6);
            }
            int i7 = zzabVar.zzE;
            if (i7 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i7);
            }
            java.lang.String str4 = zzabVar.zzd;
            if (str4 != null) {
                int i8 = com.google.android.gms.internal.ads.zzei.zza;
                java.lang.String[] strArrSplit = str4.split("-", -1);
                android.util.Pair pairCreate = android.util.Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((java.lang.String) pairCreate.first);
                if (pairCreate.second != null) {
                    timeSinceCreatedMillis.setLanguageRegion((java.lang.String) pairCreate.second);
                }
            }
            float f = zzabVar.zzx;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.zzz = true;
        this.zzc.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#1"}, result = true)
    private final boolean zzy(com.google.android.gms.internal.ads.zzob zzobVar) {
        if (zzobVar != null) {
            return zzobVar.zzc.equals(this.zzb.zze());
        }
        return false;
    }

    public final android.media.metrics.LogSessionId zza() {
        return this.zzc.getSessionId();
    }

    @Override // com.google.android.gms.internal.ads.zzod
    public final void zzc(com.google.android.gms.internal.ads.zzlu zzluVar, java.lang.String str) {
        com.google.android.gms.internal.ads.zzug zzugVar = zzluVar.zzd;
        if (zzugVar == null || !zzugVar.zzb()) {
            zzs();
            this.zzi = str;
            this.zzj = new android.media.metrics.PlaybackMetrics.Builder().setPlayerName(androidx.media3.common.MediaLibraryInfo.TAG).setPlayerVersion("1.5.0-beta01");
            zzv(zzluVar.zzb, zzluVar.zzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzod
    public final void zzd(com.google.android.gms.internal.ads.zzlu zzluVar, java.lang.String str, boolean z) {
        com.google.android.gms.internal.ads.zzug zzugVar = zzluVar.zzd;
        if ((zzugVar == null || !zzugVar.zzb()) && str.equals(this.zzi)) {
            zzs();
        }
        this.zzg.remove(str);
        this.zzh.remove(str);
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final /* synthetic */ void zze(com.google.android.gms.internal.ads.zzlu zzluVar, com.google.android.gms.internal.ads.zzab zzabVar, com.google.android.gms.internal.ads.zzht zzhtVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final void zzf(com.google.android.gms.internal.ads.zzlu zzluVar, int i, long j, long j2) {
        com.google.android.gms.internal.ads.zzug zzugVar = zzluVar.zzd;
        if (zzugVar != null) {
            java.lang.String strZzf = this.zzb.zzf(zzluVar.zzb, zzugVar);
            java.lang.Long l = (java.lang.Long) this.zzh.get(strZzf);
            java.lang.Long l2 = (java.lang.Long) this.zzg.get(strZzf);
            this.zzh.put(strZzf, java.lang.Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.zzg.put(strZzf, java.lang.Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final void zzg(com.google.android.gms.internal.ads.zzlu zzluVar, com.google.android.gms.internal.ads.zzuc zzucVar) {
        com.google.android.gms.internal.ads.zzug zzugVar = zzluVar.zzd;
        if (zzugVar == null) {
            return;
        }
        com.google.android.gms.internal.ads.zzab zzabVar = zzucVar.zzb;
        zzabVar.getClass();
        com.google.android.gms.internal.ads.zzob zzobVar = new com.google.android.gms.internal.ads.zzob(zzabVar, 0, this.zzb.zzf(zzluVar.zzb, zzugVar));
        int i = zzucVar.zza;
        if (i != 0) {
            if (i == 1) {
                this.zzp = zzobVar;
                return;
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.zzq = zzobVar;
                return;
            }
        }
        this.zzo = zzobVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final /* synthetic */ void zzh(com.google.android.gms.internal.ads.zzlu zzluVar, int i, long j) {
    }

    /* JADX WARN: Code duplicated, block: B:139:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:142:0x0201 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x0203 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:144:0x0205  */
    /* JADX WARN: Code duplicated, block: B:147:0x020c  */
    /* JADX WARN: Code duplicated, block: B:148:0x0218  */
    /* JADX WARN: Code duplicated, block: B:150:0x021e  */
    /* JADX WARN: Code duplicated, block: B:152:0x0228  */
    /* JADX WARN: Code duplicated, block: B:154:0x022c  */
    /* JADX WARN: Code duplicated, block: B:155:0x022f  */
    /* JADX WARN: Code duplicated, block: B:157:0x0233  */
    /* JADX WARN: Code duplicated, block: B:158:0x023a  */
    /* JADX WARN: Code duplicated, block: B:160:0x023e  */
    /* JADX WARN: Code duplicated, block: B:161:0x0245  */
    /* JADX WARN: Code duplicated, block: B:163:0x0249  */
    /* JADX WARN: Code duplicated, block: B:164:0x0254  */
    /* JADX WARN: Code duplicated, block: B:174:0x029d  */
    /* JADX WARN: Code duplicated, block: B:176:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:178:0x02a7  */
    @Override // com.google.android.gms.internal.ads.zzlw
    public final void zzi(com.google.android.gms.internal.ads.zzbk zzbkVar, com.google.android.gms.internal.ads.zzlv zzlvVar) {
        int i;
        int i2;
        int iZzr;
        int i3;
        int errorCode;
        int iZzm;
        com.google.android.gms.internal.ads.zzu zzuVar;
        int i4;
        int i5;
        if (zzlvVar.zzb() == 0) {
            return;
        }
        for (int i6 = 0; i6 < zzlvVar.zzb(); i6++) {
            int iZza = zzlvVar.zza(i6);
            com.google.android.gms.internal.ads.zzlu zzluVarZzc = zzlvVar.zzc(iZza);
            if (iZza == 0) {
                this.zzb.zzk(zzluVarZzc);
            } else if (iZza == 11) {
                this.zzb.zzj(zzluVarZzc, this.zzk);
            } else {
                this.zzb.zzi(zzluVarZzc);
            }
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        if (zzlvVar.zzd(0)) {
            com.google.android.gms.internal.ads.zzlu zzluVarZzc2 = zzlvVar.zzc(0);
            if (this.zzj != null) {
                zzv(zzluVarZzc2.zzb, zzluVarZzc2.zzd);
            }
        }
        if (zzlvVar.zzd(2) && this.zzj != null) {
            com.google.android.gms.internal.ads.zzfxn zzfxnVarZza = zzbkVar.zzo().zza();
            int size = zzfxnVarZza.size();
            int i7 = 0;
            loop1: while (true) {
                if (i7 >= size) {
                    zzuVar = null;
                    break;
                }
                com.google.android.gms.internal.ads.zzbx zzbxVar = (com.google.android.gms.internal.ads.zzbx) zzfxnVarZza.get(i7);
                int i8 = 0;
                while (true) {
                    i5 = i7 + 1;
                    if (i8 < zzbxVar.zza) {
                        if (zzbxVar.zzd(i8) && (zzuVar = zzbxVar.zzb(i8).zzs) != null) {
                            break loop1;
                        } else {
                            i8++;
                        }
                    }
                }
                i7 = i5;
            }
            if (zzuVar != null) {
                android.media.metrics.PlaybackMetrics.Builder builder = this.zzj;
                int i9 = com.google.android.gms.internal.ads.zzei.zza;
                int i10 = 0;
                while (true) {
                    if (i10 >= zzuVar.zzb) {
                        i4 = 1;
                        break;
                    }
                    java.util.UUID uuid = zzuVar.zza(i10).zza;
                    if (uuid.equals(com.google.android.gms.internal.ads.zzh.zzd)) {
                        i4 = 3;
                        break;
                    } else if (uuid.equals(com.google.android.gms.internal.ads.zzh.zze)) {
                        i4 = 2;
                        break;
                    } else {
                        if (uuid.equals(com.google.android.gms.internal.ads.zzh.zzc)) {
                            i4 = 6;
                            break;
                        }
                        i10++;
                    }
                }
                builder.setDrmType(i4);
            }
        }
        if (zzlvVar.zzd(1011)) {
            this.zzy++;
        }
        com.google.android.gms.internal.ads.zzbd zzbdVar = this.zzn;
        if (zzbdVar != null) {
            android.content.Context context = this.zza;
            if (zzbdVar.zza == 1001) {
                i3 = 20;
            } else {
                com.google.android.gms.internal.ads.zzib zzibVar = (com.google.android.gms.internal.ads.zzib) zzbdVar;
                boolean z = zzibVar.zzc == 1;
                int i11 = zzibVar.zzg;
                java.lang.Throwable cause = zzbdVar.getCause();
                cause.getClass();
                if (cause instanceof java.io.IOException) {
                    if (cause instanceof com.google.android.gms.internal.ads.zzgr) {
                        iZzm = ((com.google.android.gms.internal.ads.zzgr) cause).zzc;
                        i3 = 5;
                    } else if ((cause instanceof com.google.android.gms.internal.ads.zzgq) || (cause instanceof com.google.android.gms.internal.ads.zzbc)) {
                        iZzm = 0;
                        i3 = 11;
                    } else {
                        boolean z2 = cause instanceof com.google.android.gms.internal.ads.zzgp;
                        if (z2 || (cause instanceof com.google.android.gms.internal.ads.zzgz)) {
                            if (com.google.android.gms.internal.ads.zzdw.zzb(context).zza() == 1) {
                                iZzm = 0;
                                i3 = 3;
                            } else {
                                java.lang.Throwable cause2 = cause.getCause();
                                if (cause2 instanceof java.net.UnknownHostException) {
                                    iZzm = 0;
                                    i3 = 6;
                                } else if (cause2 instanceof java.net.SocketTimeoutException) {
                                    iZzm = 0;
                                    i3 = 7;
                                } else if (z2 && ((com.google.android.gms.internal.ads.zzgp) cause).zzb == 1) {
                                    iZzm = 0;
                                    i3 = 4;
                                } else {
                                    iZzm = 0;
                                    i3 = 8;
                                }
                            }
                        } else if (zzbdVar.zza == 1002) {
                            i3 = 21;
                        } else if (cause instanceof com.google.android.gms.internal.ads.zzqy) {
                            java.lang.Throwable cause3 = cause.getCause();
                            cause3.getClass();
                            if (cause3 instanceof android.media.MediaDrm.MediaDrmStateException) {
                                errorCode = com.google.android.gms.internal.ads.zzei.zzm(((android.media.MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                iZzr = zzr(errorCode);
                                int i12 = iZzr;
                                iZzm = errorCode;
                                i3 = i12;
                            } else if (com.google.android.gms.internal.ads.zzei.zza >= 23 && (cause3 instanceof android.media.MediaDrmResetException)) {
                                i3 = 27;
                            } else if (cause3 instanceof android.media.NotProvisionedException) {
                                i3 = 24;
                            } else if (cause3 instanceof android.media.DeniedByServerException) {
                                i3 = 29;
                            } else if (cause3 instanceof com.google.android.gms.internal.ads.zzri) {
                                iZzm = 0;
                                i3 = 23;
                            } else {
                                i3 = cause3 instanceof com.google.android.gms.internal.ads.zzqx ? 28 : 30;
                            }
                        } else if ((cause instanceof com.google.android.gms.internal.ads.zzgm) && (cause.getCause() instanceof java.io.FileNotFoundException)) {
                            java.lang.Throwable cause4 = cause.getCause();
                            cause4.getClass();
                            java.lang.Throwable cause5 = cause4.getCause();
                            if ((cause5 instanceof android.system.ErrnoException) && ((android.system.ErrnoException) cause5).errno == android.system.OsConstants.EACCES) {
                                i3 = 32;
                            } else {
                                iZzm = 0;
                                i3 = 31;
                            }
                        } else {
                            iZzm = 0;
                            i3 = 9;
                        }
                    }
                } else if (z) {
                    i3 = 35;
                    if (i11 != 0 && i11 != 1) {
                        if (!z && i11 == 3) {
                            i3 = 15;
                        } else if (!z && i11 == 2) {
                            iZzm = 0;
                            i3 = 23;
                        } else if (cause instanceof com.google.android.gms.internal.ads.zzsj) {
                            iZzm = com.google.android.gms.internal.ads.zzei.zzm(((com.google.android.gms.internal.ads.zzsj) cause).zzd);
                            i3 = 13;
                        } else {
                            iZzr = 14;
                            if (cause instanceof com.google.android.gms.internal.ads.zzsf) {
                                errorCode = ((com.google.android.gms.internal.ads.zzsf) cause).zzb;
                            } else if (cause instanceof java.lang.OutOfMemoryError) {
                                i3 = 14;
                            } else if (cause instanceof com.google.android.gms.internal.ads.zzpi) {
                                errorCode = ((com.google.android.gms.internal.ads.zzpi) cause).zza;
                                iZzr = 17;
                            } else if (cause instanceof com.google.android.gms.internal.ads.zzpl) {
                                errorCode = ((com.google.android.gms.internal.ads.zzpl) cause).zza;
                                iZzr = 18;
                            } else if (cause instanceof android.media.MediaCodec.CryptoException) {
                                errorCode = ((android.media.MediaCodec.CryptoException) cause).getErrorCode();
                                iZzr = zzr(errorCode);
                            } else {
                                i3 = 22;
                            }
                            int i13 = iZzr;
                            iZzm = errorCode;
                            i3 = i13;
                        }
                    }
                } else if (!z) {
                    if (!z) {
                    }
                    if (cause instanceof com.google.android.gms.internal.ads.zzsj) {
                        iZzm = com.google.android.gms.internal.ads.zzei.zzm(((com.google.android.gms.internal.ads.zzsj) cause).zzd);
                        i3 = 13;
                    } else {
                        iZzr = 14;
                        if (cause instanceof com.google.android.gms.internal.ads.zzsf) {
                            errorCode = ((com.google.android.gms.internal.ads.zzsf) cause).zzb;
                        } else if (cause instanceof java.lang.OutOfMemoryError) {
                            i3 = 14;
                        } else if (cause instanceof com.google.android.gms.internal.ads.zzpi) {
                            errorCode = ((com.google.android.gms.internal.ads.zzpi) cause).zza;
                            iZzr = 17;
                        } else if (cause instanceof com.google.android.gms.internal.ads.zzpl) {
                            errorCode = ((com.google.android.gms.internal.ads.zzpl) cause).zza;
                            iZzr = 18;
                        } else if (cause instanceof android.media.MediaCodec.CryptoException) {
                            errorCode = ((android.media.MediaCodec.CryptoException) cause).getErrorCode();
                            iZzr = zzr(errorCode);
                        } else {
                            i3 = 22;
                        }
                        int i14 = iZzr;
                        iZzm = errorCode;
                        i3 = i14;
                    }
                } else {
                    if (!z) {
                    }
                    if (cause instanceof com.google.android.gms.internal.ads.zzsj) {
                        iZzm = com.google.android.gms.internal.ads.zzei.zzm(((com.google.android.gms.internal.ads.zzsj) cause).zzd);
                        i3 = 13;
                    } else {
                        iZzr = 14;
                        if (cause instanceof com.google.android.gms.internal.ads.zzsf) {
                            errorCode = ((com.google.android.gms.internal.ads.zzsf) cause).zzb;
                        } else if (cause instanceof java.lang.OutOfMemoryError) {
                            i3 = 14;
                        } else if (cause instanceof com.google.android.gms.internal.ads.zzpi) {
                            errorCode = ((com.google.android.gms.internal.ads.zzpi) cause).zza;
                            iZzr = 17;
                        } else if (cause instanceof com.google.android.gms.internal.ads.zzpl) {
                            errorCode = ((com.google.android.gms.internal.ads.zzpl) cause).zza;
                            iZzr = 18;
                        } else if (cause instanceof android.media.MediaCodec.CryptoException) {
                            errorCode = ((android.media.MediaCodec.CryptoException) cause).getErrorCode();
                            iZzr = zzr(errorCode);
                        } else {
                            i3 = 22;
                        }
                        int i15 = iZzr;
                        iZzm = errorCode;
                        i3 = i15;
                    }
                }
                this.zzc.reportPlaybackErrorEvent(new android.media.metrics.PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.zzd).setErrorCode(i3).setSubErrorCode(iZzm).setException(zzbdVar).build());
                this.zzz = true;
                this.zzn = null;
            }
            iZzm = 0;
            this.zzc.reportPlaybackErrorEvent(new android.media.metrics.PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.zzd).setErrorCode(i3).setSubErrorCode(iZzm).setException(zzbdVar).build());
            this.zzz = true;
            this.zzn = null;
        }
        if (zzlvVar.zzd(2)) {
            com.google.android.gms.internal.ads.zzby zzbyVarZzo = zzbkVar.zzo();
            boolean zZzb = zzbyVarZzo.zzb(2);
            boolean zZzb2 = zzbyVarZzo.zzb(1);
            boolean zZzb3 = zzbyVarZzo.zzb(3);
            if (zZzb || zZzb2) {
                if (!zZzb) {
                    zzw(jElapsedRealtime, null, 0);
                }
                if (!zZzb2) {
                    zzt(jElapsedRealtime, null, 0);
                }
                if (!zZzb3) {
                    zzu(jElapsedRealtime, null, 0);
                }
            } else if (zZzb3) {
                zZzb3 = true;
                if (!zZzb) {
                    zzw(jElapsedRealtime, null, 0);
                }
                if (!zZzb2) {
                    zzt(jElapsedRealtime, null, 0);
                }
                if (!zZzb3) {
                    zzu(jElapsedRealtime, null, 0);
                }
            }
        }
        if (zzy(this.zzo)) {
            com.google.android.gms.internal.ads.zzob zzobVar = this.zzo;
            com.google.android.gms.internal.ads.zzab zzabVar = zzobVar.zza;
            if (zzabVar.zzw != -1) {
                int i16 = zzobVar.zzb;
                zzw(jElapsedRealtime, zzabVar, 0);
                this.zzo = null;
            }
        }
        if (zzy(this.zzp)) {
            com.google.android.gms.internal.ads.zzob zzobVar2 = this.zzp;
            com.google.android.gms.internal.ads.zzab zzabVar2 = zzobVar2.zza;
            int i17 = zzobVar2.zzb;
            zzt(jElapsedRealtime, zzabVar2, 0);
            this.zzp = null;
        }
        if (zzy(this.zzq)) {
            com.google.android.gms.internal.ads.zzob zzobVar3 = this.zzq;
            com.google.android.gms.internal.ads.zzab zzabVar3 = zzobVar3.zza;
            int i18 = zzobVar3.zzb;
            zzu(jElapsedRealtime, zzabVar3, 0);
            this.zzq = null;
        }
        switch (com.google.android.gms.internal.ads.zzdw.zzb(this.zza).zza()) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 9;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
            case 8:
            default:
                i = 1;
                break;
            case 7:
                i = 3;
                break;
            case 9:
                i = 8;
                break;
            case 10:
                i = 7;
                break;
        }
        if (i != this.zzm) {
            this.zzm = i;
            this.zzc.reportNetworkEvent(new android.media.metrics.NetworkEvent.Builder().setNetworkType(i).setTimeSinceCreatedMillis(jElapsedRealtime - this.zzd).build());
        }
        if (zzbkVar.zzf() != 2) {
            this.zzu = false;
        }
        if (((com.google.android.gms.internal.ads.zzlr) zzbkVar).zzC() == null) {
            this.zzv = false;
        } else if (zzlvVar.zzd(10)) {
            this.zzv = true;
        }
        int iZzf = zzbkVar.zzf();
        if (this.zzu) {
            i2 = 5;
        } else if (this.zzv) {
            i2 = 13;
        } else {
            i2 = 4;
            if (iZzf == 4) {
                i2 = 11;
            } else if (iZzf == 2) {
                int i19 = this.zzl;
                if (i19 == 0 || i19 == 2 || i19 == 12) {
                    i2 = 2;
                } else if (zzbkVar.zzu()) {
                    i2 = zzbkVar.zzg() != 0 ? 10 : 6;
                } else {
                    i2 = 7;
                }
            } else if (iZzf != 3) {
                i2 = (iZzf != 1 || this.zzl == 0) ? this.zzl : 12;
            } else if (zzbkVar.zzu()) {
                i2 = zzbkVar.zzg() != 0 ? 9 : 3;
            }
        }
        if (this.zzl != i2) {
            this.zzl = i2;
            this.zzz = true;
            this.zzc.reportPlaybackStateEvent(new android.media.metrics.PlaybackStateEvent.Builder().setState(this.zzl).setTimeSinceCreatedMillis(jElapsedRealtime - this.zzd).build());
        }
        if (zzlvVar.zzd(1028)) {
            this.zzb.zzg(zzlvVar.zzc(1028));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final void zzj(com.google.android.gms.internal.ads.zzlu zzluVar, com.google.android.gms.internal.ads.zztx zztxVar, com.google.android.gms.internal.ads.zzuc zzucVar, java.io.IOException iOException, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final /* synthetic */ void zzk(com.google.android.gms.internal.ads.zzlu zzluVar, int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final void zzl(com.google.android.gms.internal.ads.zzlu zzluVar, com.google.android.gms.internal.ads.zzbd zzbdVar) {
        this.zzn = zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final void zzm(com.google.android.gms.internal.ads.zzlu zzluVar, com.google.android.gms.internal.ads.zzbi zzbiVar, com.google.android.gms.internal.ads.zzbi zzbiVar2, int i) {
        if (i == 1) {
            this.zzu = true;
            i = 1;
        }
        this.zzk = i;
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final /* synthetic */ void zzn(com.google.android.gms.internal.ads.zzlu zzluVar, java.lang.Object obj, long j) {
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final void zzo(com.google.android.gms.internal.ads.zzlu zzluVar, com.google.android.gms.internal.ads.zzhs zzhsVar) {
        this.zzw += zzhsVar.zzg;
        this.zzx += zzhsVar.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final /* synthetic */ void zzp(com.google.android.gms.internal.ads.zzlu zzluVar, com.google.android.gms.internal.ads.zzab zzabVar, com.google.android.gms.internal.ads.zzht zzhtVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzlw
    public final void zzq(com.google.android.gms.internal.ads.zzlu zzluVar, com.google.android.gms.internal.ads.zzcd zzcdVar) {
        com.google.android.gms.internal.ads.zzob zzobVar = this.zzo;
        if (zzobVar != null) {
            com.google.android.gms.internal.ads.zzab zzabVar = zzobVar.zza;
            if (zzabVar.zzw == -1) {
                com.google.android.gms.internal.ads.zzz zzzVarZzb = zzabVar.zzb();
                zzzVarZzb.zzaf(zzcdVar.zzb);
                zzzVarZzb.zzK(zzcdVar.zzc);
                this.zzo = new com.google.android.gms.internal.ads.zzob(zzzVarZzb.zzag(), 0, zzobVar.zzc);
            }
        }
    }
}
