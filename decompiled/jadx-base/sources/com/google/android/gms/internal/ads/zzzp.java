package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzzp extends com.google.android.gms.internal.ads.zzsn implements com.google.android.gms.internal.ads.zzaak {
    private static final int[] zzb = {1920, com.json.mediationsdk.utils.IronSourceConstants.RV_OPERATIONAL_LOAD_AD, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean zzc;
    private static boolean zzd;
    private long zzA;
    private int zzB;
    private long zzC;
    private com.google.android.gms.internal.ads.zzcd zzD;
    private com.google.android.gms.internal.ads.zzcd zzE;
    private int zzF;
    private int zzG;
    private com.google.android.gms.internal.ads.zzaai zzH;
    private long zzI;
    private long zzJ;
    private boolean zzK;
    private final android.content.Context zze;
    private final boolean zzf;
    private final com.google.android.gms.internal.ads.zzabb zzg;
    private final boolean zzh;
    private final com.google.android.gms.internal.ads.zzaal zzi;
    private final com.google.android.gms.internal.ads.zzaaj zzj;
    private com.google.android.gms.internal.ads.zzzo zzk;
    private boolean zzl;
    private boolean zzm;
    private com.google.android.gms.internal.ads.zzabh zzn;
    private boolean zzo;
    private java.util.List zzp;
    private android.view.Surface zzq;
    private com.google.android.gms.internal.ads.zzzs zzr;
    private com.google.android.gms.internal.ads.zzdz zzs;
    private boolean zzt;
    private int zzu;
    private int zzv;
    private long zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzzp(android.content.Context context, com.google.android.gms.internal.ads.zzsb zzsbVar, com.google.android.gms.internal.ads.zzsp zzspVar, long j, boolean z, android.os.Handler handler, com.google.android.gms.internal.ads.zzabc zzabcVar, int i, float f) {
        super(2, zzsbVar, zzspVar, false, 30.0f);
        android.content.Context applicationContext = context.getApplicationContext();
        this.zze = applicationContext;
        this.zzn = null;
        this.zzg = new com.google.android.gms.internal.ads.zzabb(handler, zzabcVar);
        this.zzf = true;
        this.zzi = new com.google.android.gms.internal.ads.zzaal(applicationContext, this, 0L);
        this.zzj = new com.google.android.gms.internal.ads.zzaaj();
        this.zzh = "NVIDIA".equals(com.google.android.gms.internal.ads.zzei.zzc);
        this.zzs = com.google.android.gms.internal.ads.zzdz.zza;
        this.zzu = 1;
        this.zzv = 0;
        this.zzD = com.google.android.gms.internal.ads.zzcd.zza;
        this.zzG = 0;
        this.zzE = null;
        this.zzF = -1000;
        this.zzI = androidx.media3.common.C.TIME_UNSET;
        this.zzJ = androidx.media3.common.C.TIME_UNSET;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0154  */
    /* JADX WARN: Code duplicated, block: B:103:0x0158  */
    /* JADX WARN: Code duplicated, block: B:105:0x0160  */
    /* JADX WARN: Code duplicated, block: B:106:0x0164  */
    /* JADX WARN: Code duplicated, block: B:108:0x016c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0170  */
    /* JADX WARN: Code duplicated, block: B:111:0x0178  */
    /* JADX WARN: Code duplicated, block: B:112:0x017c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0184  */
    /* JADX WARN: Code duplicated, block: B:115:0x0188  */
    /* JADX WARN: Code duplicated, block: B:117:0x0190  */
    /* JADX WARN: Code duplicated, block: B:118:0x0194  */
    /* JADX WARN: Code duplicated, block: B:120:0x019c  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:126:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:127:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:129:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:130:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:132:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:133:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:136:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:138:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:139:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:141:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:142:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:144:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:145:0x0200  */
    /* JADX WARN: Code duplicated, block: B:147:0x0208  */
    /* JADX WARN: Code duplicated, block: B:148:0x020c  */
    /* JADX WARN: Code duplicated, block: B:150:0x0214  */
    /* JADX WARN: Code duplicated, block: B:151:0x0218  */
    /* JADX WARN: Code duplicated, block: B:153:0x0220  */
    /* JADX WARN: Code duplicated, block: B:154:0x0224  */
    /* JADX WARN: Code duplicated, block: B:156:0x022c  */
    /* JADX WARN: Code duplicated, block: B:157:0x0230  */
    /* JADX WARN: Code duplicated, block: B:159:0x0238  */
    /* JADX WARN: Code duplicated, block: B:160:0x023c  */
    /* JADX WARN: Code duplicated, block: B:162:0x0244  */
    /* JADX WARN: Code duplicated, block: B:163:0x0248  */
    /* JADX WARN: Code duplicated, block: B:165:0x0250  */
    /* JADX WARN: Code duplicated, block: B:166:0x0254  */
    /* JADX WARN: Code duplicated, block: B:168:0x025c  */
    /* JADX WARN: Code duplicated, block: B:169:0x0260  */
    /* JADX WARN: Code duplicated, block: B:171:0x0268  */
    /* JADX WARN: Code duplicated, block: B:172:0x026c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0274  */
    /* JADX WARN: Code duplicated, block: B:175:0x0278  */
    /* JADX WARN: Code duplicated, block: B:177:0x0280  */
    /* JADX WARN: Code duplicated, block: B:178:0x0284  */
    /* JADX WARN: Code duplicated, block: B:180:0x028c  */
    /* JADX WARN: Code duplicated, block: B:181:0x0290  */
    /* JADX WARN: Code duplicated, block: B:183:0x0298  */
    /* JADX WARN: Code duplicated, block: B:184:0x029c  */
    /* JADX WARN: Code duplicated, block: B:186:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:187:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:189:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:190:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:192:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:193:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:195:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:196:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:198:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:199:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:201:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:202:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:204:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:205:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:207:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:208:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:210:0x0303  */
    /* JADX WARN: Code duplicated, block: B:211:0x0307  */
    /* JADX WARN: Code duplicated, block: B:213:0x030f  */
    /* JADX WARN: Code duplicated, block: B:214:0x0313  */
    /* JADX WARN: Code duplicated, block: B:216:0x031b  */
    /* JADX WARN: Code duplicated, block: B:217:0x031f  */
    /* JADX WARN: Code duplicated, block: B:219:0x0327  */
    /* JADX WARN: Code duplicated, block: B:220:0x032b  */
    /* JADX WARN: Code duplicated, block: B:222:0x0333  */
    /* JADX WARN: Code duplicated, block: B:223:0x0337  */
    /* JADX WARN: Code duplicated, block: B:225:0x033f  */
    /* JADX WARN: Code duplicated, block: B:226:0x0343  */
    /* JADX WARN: Code duplicated, block: B:228:0x034b  */
    /* JADX WARN: Code duplicated, block: B:229:0x034f  */
    /* JADX WARN: Code duplicated, block: B:231:0x0357  */
    /* JADX WARN: Code duplicated, block: B:232:0x035b  */
    /* JADX WARN: Code duplicated, block: B:234:0x0363  */
    /* JADX WARN: Code duplicated, block: B:235:0x0367  */
    /* JADX WARN: Code duplicated, block: B:237:0x036f  */
    /* JADX WARN: Code duplicated, block: B:238:0x0373  */
    /* JADX WARN: Code duplicated, block: B:240:0x037b  */
    /* JADX WARN: Code duplicated, block: B:241:0x037f  */
    /* JADX WARN: Code duplicated, block: B:243:0x0387  */
    /* JADX WARN: Code duplicated, block: B:244:0x038b  */
    /* JADX WARN: Code duplicated, block: B:246:0x0393  */
    /* JADX WARN: Code duplicated, block: B:247:0x0397  */
    /* JADX WARN: Code duplicated, block: B:249:0x039f  */
    /* JADX WARN: Code duplicated, block: B:250:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:252:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:253:0x03af  */
    /* JADX WARN: Code duplicated, block: B:255:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:256:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:258:0x03c2  */
    /* JADX WARN: Code duplicated, block: B:259:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:261:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:262:0x03d1  */
    /* JADX WARN: Code duplicated, block: B:264:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:265:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:267:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:268:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:270:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:271:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:273:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:274:0x0400  */
    /* JADX WARN: Code duplicated, block: B:276:0x0408  */
    /* JADX WARN: Code duplicated, block: B:277:0x040c  */
    /* JADX WARN: Code duplicated, block: B:279:0x0414  */
    /* JADX WARN: Code duplicated, block: B:280:0x0418  */
    /* JADX WARN: Code duplicated, block: B:282:0x0420  */
    /* JADX WARN: Code duplicated, block: B:283:0x0424  */
    /* JADX WARN: Code duplicated, block: B:285:0x042c  */
    /* JADX WARN: Code duplicated, block: B:286:0x0430  */
    /* JADX WARN: Code duplicated, block: B:288:0x0438  */
    /* JADX WARN: Code duplicated, block: B:289:0x043c  */
    /* JADX WARN: Code duplicated, block: B:291:0x0444  */
    /* JADX WARN: Code duplicated, block: B:292:0x0448  */
    /* JADX WARN: Code duplicated, block: B:294:0x0450  */
    /* JADX WARN: Code duplicated, block: B:295:0x0454  */
    /* JADX WARN: Code duplicated, block: B:297:0x045c  */
    /* JADX WARN: Code duplicated, block: B:298:0x0460  */
    /* JADX WARN: Code duplicated, block: B:300:0x0468  */
    /* JADX WARN: Code duplicated, block: B:301:0x046c  */
    /* JADX WARN: Code duplicated, block: B:303:0x0474  */
    /* JADX WARN: Code duplicated, block: B:304:0x0478  */
    /* JADX WARN: Code duplicated, block: B:306:0x0480  */
    /* JADX WARN: Code duplicated, block: B:307:0x0484  */
    /* JADX WARN: Code duplicated, block: B:309:0x048c  */
    /* JADX WARN: Code duplicated, block: B:310:0x0490  */
    /* JADX WARN: Code duplicated, block: B:312:0x0498  */
    /* JADX WARN: Code duplicated, block: B:313:0x049b  */
    /* JADX WARN: Code duplicated, block: B:315:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:316:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:318:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:319:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:321:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:322:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:325:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:327:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:328:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:330:0x04da  */
    /* JADX WARN: Code duplicated, block: B:331:0x04dd  */
    /* JADX WARN: Code duplicated, block: B:333:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:334:0x04e9  */
    /* JADX WARN: Code duplicated, block: B:336:0x04f1  */
    /* JADX WARN: Code duplicated, block: B:337:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:339:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:340:0x0501  */
    /* JADX WARN: Code duplicated, block: B:342:0x0509  */
    /* JADX WARN: Code duplicated, block: B:343:0x050d  */
    /* JADX WARN: Code duplicated, block: B:345:0x0515  */
    /* JADX WARN: Code duplicated, block: B:346:0x0519  */
    /* JADX WARN: Code duplicated, block: B:348:0x0521  */
    /* JADX WARN: Code duplicated, block: B:349:0x0525  */
    /* JADX WARN: Code duplicated, block: B:351:0x052d  */
    /* JADX WARN: Code duplicated, block: B:352:0x0531  */
    /* JADX WARN: Code duplicated, block: B:354:0x0539  */
    /* JADX WARN: Code duplicated, block: B:355:0x053d  */
    /* JADX WARN: Code duplicated, block: B:357:0x0545  */
    /* JADX WARN: Code duplicated, block: B:358:0x0549  */
    /* JADX WARN: Code duplicated, block: B:360:0x0551  */
    /* JADX WARN: Code duplicated, block: B:361:0x0555  */
    /* JADX WARN: Code duplicated, block: B:363:0x055d  */
    /* JADX WARN: Code duplicated, block: B:364:0x0561  */
    /* JADX WARN: Code duplicated, block: B:366:0x0569  */
    /* JADX WARN: Code duplicated, block: B:367:0x056d  */
    /* JADX WARN: Code duplicated, block: B:369:0x0575  */
    /* JADX WARN: Code duplicated, block: B:370:0x0579  */
    /* JADX WARN: Code duplicated, block: B:372:0x0581  */
    /* JADX WARN: Code duplicated, block: B:373:0x0585  */
    /* JADX WARN: Code duplicated, block: B:375:0x058d  */
    /* JADX WARN: Code duplicated, block: B:376:0x0591  */
    /* JADX WARN: Code duplicated, block: B:378:0x0599  */
    /* JADX WARN: Code duplicated, block: B:379:0x059d  */
    /* JADX WARN: Code duplicated, block: B:381:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:382:0x05a9  */
    /* JADX WARN: Code duplicated, block: B:384:0x05b1  */
    /* JADX WARN: Code duplicated, block: B:385:0x05b5  */
    /* JADX WARN: Code duplicated, block: B:387:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:388:0x05c1  */
    /* JADX WARN: Code duplicated, block: B:390:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:391:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:393:0x05d5  */
    /* JADX WARN: Code duplicated, block: B:394:0x05d9  */
    /* JADX WARN: Code duplicated, block: B:396:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:397:0x05e5  */
    /* JADX WARN: Code duplicated, block: B:399:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:400:0x05f1  */
    /* JADX WARN: Code duplicated, block: B:402:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:403:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:405:0x0605  */
    /* JADX WARN: Code duplicated, block: B:406:0x0609  */
    /* JADX WARN: Code duplicated, block: B:408:0x0611  */
    /* JADX WARN: Code duplicated, block: B:409:0x0615  */
    /* JADX WARN: Code duplicated, block: B:411:0x061d  */
    /* JADX WARN: Code duplicated, block: B:412:0x0621  */
    /* JADX WARN: Code duplicated, block: B:414:0x0629  */
    /* JADX WARN: Code duplicated, block: B:415:0x062d  */
    /* JADX WARN: Code duplicated, block: B:417:0x0635  */
    /* JADX WARN: Code duplicated, block: B:418:0x0639  */
    /* JADX WARN: Code duplicated, block: B:41:0x0080 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:420:0x0641  */
    /* JADX WARN: Code duplicated, block: B:421:0x0645  */
    /* JADX WARN: Code duplicated, block: B:423:0x064d  */
    /* JADX WARN: Code duplicated, block: B:424:0x0651  */
    /* JADX WARN: Code duplicated, block: B:426:0x0659  */
    /* JADX WARN: Code duplicated, block: B:427:0x065c  */
    /* JADX WARN: Code duplicated, block: B:429:0x0664  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083 A[Catch: all -> 0x07ab, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:515:0x07a3, B:42:0x0083, B:44:0x0089, B:47:0x0094, B:80:0x00ff, B:82:0x0105, B:507:0x078e, B:516:0x07a7), top: B:522:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:430:0x0667  */
    /* JADX WARN: Code duplicated, block: B:432:0x066f  */
    /* JADX WARN: Code duplicated, block: B:433:0x0673  */
    /* JADX WARN: Code duplicated, block: B:435:0x067b  */
    /* JADX WARN: Code duplicated, block: B:436:0x067f  */
    /* JADX WARN: Code duplicated, block: B:438:0x0687  */
    /* JADX WARN: Code duplicated, block: B:439:0x068b  */
    /* JADX WARN: Code duplicated, block: B:441:0x0693  */
    /* JADX WARN: Code duplicated, block: B:442:0x0697  */
    /* JADX WARN: Code duplicated, block: B:444:0x069f  */
    /* JADX WARN: Code duplicated, block: B:445:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:447:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:448:0x06af  */
    /* JADX WARN: Code duplicated, block: B:450:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:451:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:453:0x06c3  */
    /* JADX WARN: Code duplicated, block: B:454:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:456:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:457:0x06d3  */
    /* JADX WARN: Code duplicated, block: B:459:0x06db  */
    /* JADX WARN: Code duplicated, block: B:460:0x06df  */
    /* JADX WARN: Code duplicated, block: B:462:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:463:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:465:0x06f3  */
    /* JADX WARN: Code duplicated, block: B:466:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:468:0x06ff  */
    /* JADX WARN: Code duplicated, block: B:469:0x0703  */
    /* JADX WARN: Code duplicated, block: B:471:0x070b  */
    /* JADX WARN: Code duplicated, block: B:472:0x070f  */
    /* JADX WARN: Code duplicated, block: B:474:0x0717  */
    /* JADX WARN: Code duplicated, block: B:475:0x071b  */
    /* JADX WARN: Code duplicated, block: B:477:0x0723  */
    /* JADX WARN: Code duplicated, block: B:478:0x0727  */
    /* JADX WARN: Code duplicated, block: B:47:0x0094 A[Catch: all -> 0x07ab, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:515:0x07a3, B:42:0x0083, B:44:0x0089, B:47:0x0094, B:80:0x00ff, B:82:0x0105, B:507:0x078e, B:516:0x07a7), top: B:522:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:480:0x072f  */
    /* JADX WARN: Code duplicated, block: B:481:0x0732  */
    /* JADX WARN: Code duplicated, block: B:483:0x073a  */
    /* JADX WARN: Code duplicated, block: B:484:0x073d  */
    /* JADX WARN: Code duplicated, block: B:486:0x0745  */
    /* JADX WARN: Code duplicated, block: B:487:0x0748  */
    /* JADX WARN: Code duplicated, block: B:489:0x0750  */
    /* JADX WARN: Code duplicated, block: B:490:0x0753  */
    /* JADX WARN: Code duplicated, block: B:492:0x075b  */
    /* JADX WARN: Code duplicated, block: B:493:0x075e  */
    /* JADX WARN: Code duplicated, block: B:495:0x0766  */
    /* JADX WARN: Code duplicated, block: B:496:0x0769  */
    /* JADX WARN: Code duplicated, block: B:498:0x0771  */
    /* JADX WARN: Code duplicated, block: B:499:0x0774  */
    /* JADX WARN: Code duplicated, block: B:501:0x077c  */
    /* JADX WARN: Code duplicated, block: B:502:0x077f  */
    /* JADX WARN: Code duplicated, block: B:504:0x0787  */
    /* JADX WARN: Code duplicated, block: B:505:0x078a  */
    /* JADX WARN: Code duplicated, block: B:507:0x078e A[Catch: all -> 0x07ab, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:515:0x07a3, B:42:0x0083, B:44:0x0089, B:47:0x0094, B:80:0x00ff, B:82:0x0105, B:507:0x078e, B:516:0x07a7), top: B:522:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:511:0x0798  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:532:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:533:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:534:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:535:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:536:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:537:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:538:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:539:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:540:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:541:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:542:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:543:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:544:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:545:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:546:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:547:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:548:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:549:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:550:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:551:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:552:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:553:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:554:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:555:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:556:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:557:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:558:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:559:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:560:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:561:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:563:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:564:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:565:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:566:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:567:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:568:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:570:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:571:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:573:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:574:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:575:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:576:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:577:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:578:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:579:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:580:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:581:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:582:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:583:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:584:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:585:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:586:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:587:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:588:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:589:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:590:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:591:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:592:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:593:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:594:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:595:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:596:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:597:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:598:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:599:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:600:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:602:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:603:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:605:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:606:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:607:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:608:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:609:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:610:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:611:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:612:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:613:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:614:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:615:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:616:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:617:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:618:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:619:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:620:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:621:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:622:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:623:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:624:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:625:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:626:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:627:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:628:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:629:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:630:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:631:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:632:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:633:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:634:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:635:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:636:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:637:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:640:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:641:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:642:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:643:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:644:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:645:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:647:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:648:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:656:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:657:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:658:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:659:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:660:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:661:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:662:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:663:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:664:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:665:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:666:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:667:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:668:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:669:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:670:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:671:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:672:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:673:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:674:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:675:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:676:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:677:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:678:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:679:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:680:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x00db  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ff A[Catch: all -> 0x07ab, TRY_ENTER, TryCatch #0 {, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:515:0x07a3, B:42:0x0083, B:44:0x0089, B:47:0x0094, B:80:0x00ff, B:82:0x0105, B:507:0x078e, B:516:0x07a7), top: B:522:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0105 A[Catch: all -> 0x07ab, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x000f, B:9:0x0013, B:11:0x0021, B:515:0x07a3, B:42:0x0083, B:44:0x0089, B:47:0x0094, B:80:0x00ff, B:82:0x0105, B:507:0x078e, B:516:0x07a7), top: B:522:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0110  */
    /* JADX WARN: Code duplicated, block: B:87:0x0118  */
    /* JADX WARN: Code duplicated, block: B:88:0x011c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0124  */
    /* JADX WARN: Code duplicated, block: B:91:0x0128  */
    /* JADX WARN: Code duplicated, block: B:93:0x0130  */
    /* JADX WARN: Code duplicated, block: B:94:0x0134  */
    /* JADX WARN: Code duplicated, block: B:96:0x013c  */
    /* JADX WARN: Code duplicated, block: B:97:0x0140  */
    /* JADX WARN: Code duplicated, block: B:99:0x0148  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    protected static final boolean zzaU(java.lang.String str) {
        java.lang.String str2;
        byte b;
        java.lang.String str3;
        byte b2;
        boolean z = false;
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (com.google.android.gms.internal.ads.zzzp.class) {
            if (!zzc) {
                byte b3 = 28;
                byte b4 = -1;
                if (com.google.android.gms.internal.ads.zzei.zza <= 28) {
                    java.lang.String str4 = com.google.android.gms.internal.ads.zzei.zzb;
                    switch (str4.hashCode()) {
                        case -1339091551:
                            b2 = !str4.equals("dangal") ? (byte) -1 : (byte) 1;
                            break;
                        case -1220081023:
                            b2 = !str4.equals("dangalFHD") ? (byte) -1 : (byte) 3;
                            break;
                        case -1220066608:
                            b2 = !str4.equals("dangalUHD") ? (byte) -1 : (byte) 2;
                            break;
                        case -1012436106:
                            b2 = !str4.equals("oneday") ? (byte) -1 : (byte) 7;
                            break;
                        case -760312546:
                            b2 = !str4.equals("aquaman") ? (byte) -1 : (byte) 0;
                            break;
                        case -64886864:
                            b2 = !str4.equals("magnolia") ? (byte) -1 : (byte) 4;
                            break;
                        case 3415681:
                            b2 = !str4.equals("once") ? (byte) -1 : (byte) 6;
                            break;
                        case 825323514:
                            b2 = !str4.equals("machuca") ? (byte) -1 : (byte) 5;
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    switch (b2) {
                        default:
                            if (com.google.android.gms.internal.ads.zzei.zza <= 27 || !"HWEML".equals(com.google.android.gms.internal.ads.zzei.zzb)) {
                                str2 = com.google.android.gms.internal.ads.zzei.zzd;
                                switch (str2.hashCode()) {
                                    case -349662828:
                                        if (!str2.equals("AFTJMST12")) {
                                            b = -1;
                                        } else {
                                            b = 6;
                                        }
                                        break;
                                    case -321033677:
                                        if (!str2.equals("AFTKMST12")) {
                                            b = -1;
                                        } else {
                                            b = 7;
                                        }
                                        break;
                                    case 2006354:
                                        if (!str2.equals("AFTA")) {
                                            b = -1;
                                        } else {
                                            b = 0;
                                        }
                                        break;
                                    case 2006367:
                                        if (!str2.equals("AFTN")) {
                                            b = -1;
                                        } else {
                                            b = 1;
                                        }
                                        break;
                                    case 2006371:
                                        if (!str2.equals("AFTR")) {
                                            b = -1;
                                        } else {
                                            b = 2;
                                        }
                                        break;
                                    case 1785421873:
                                        if (!str2.equals("AFTEU011")) {
                                            b = -1;
                                        } else {
                                            b = 3;
                                        }
                                        break;
                                    case 1785421876:
                                        if (!str2.equals("AFTEU014")) {
                                            b = -1;
                                        } else {
                                            b = 4;
                                        }
                                        break;
                                    case 1798172390:
                                        if (!str2.equals("AFTSO001")) {
                                            b = -1;
                                        } else {
                                            b = 8;
                                        }
                                        break;
                                    case 2119412532:
                                        if (!str2.equals("AFTEUFF014")) {
                                            b = -1;
                                        } else {
                                            b = 5;
                                        }
                                        break;
                                    default:
                                        b = -1;
                                        break;
                                }
                                switch (b) {
                                    default:
                                        if (com.google.android.gms.internal.ads.zzei.zza <= 26) {
                                            str3 = com.google.android.gms.internal.ads.zzei.zzb;
                                            switch (str3.hashCode()) {
                                                case -2144781245:
                                                    if (!str3.equals("GIONEE_SWW1609")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 54;
                                                    }
                                                    break;
                                                case -2144781185:
                                                    if (!str3.equals("GIONEE_SWW1627")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 55;
                                                    }
                                                    break;
                                                case -2144781160:
                                                    if (!str3.equals("GIONEE_SWW1631")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 56;
                                                    }
                                                    break;
                                                case -2097309513:
                                                    if (!str3.equals("K50a40")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 74;
                                                    }
                                                    break;
                                                case -2022874474:
                                                    if (!str3.equals("CP8676_I02")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 22;
                                                    }
                                                    break;
                                                case -1978993182:
                                                    if (!str3.equals("NX541J")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 89;
                                                    }
                                                    break;
                                                case -1978990237:
                                                    if (!str3.equals("NX573J")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 90;
                                                    }
                                                    break;
                                                case -1936688988:
                                                    if (!str3.equals("PGN528")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 101;
                                                    }
                                                    break;
                                                case -1936688066:
                                                    if (!str3.equals("PGN610")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 102;
                                                    }
                                                    break;
                                                case -1936688065:
                                                    if (!str3.equals("PGN611")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 103;
                                                    }
                                                    break;
                                                case -1931988508:
                                                    if (!str3.equals("AquaPowerM")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 13;
                                                    }
                                                    break;
                                                case -1885099851:
                                                    if (!str3.equals("RAIJIN")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 116;
                                                    }
                                                    break;
                                                case -1696512866:
                                                    if (!str3.equals("XT1663")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 137;
                                                    }
                                                    break;
                                                case -1680025915:
                                                    if (!str3.equals("ComioS1")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 21;
                                                    }
                                                    break;
                                                case -1615810839:
                                                    if (!str3.equals("Phantom6")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 104;
                                                    }
                                                    break;
                                                case -1600724499:
                                                    if (!str3.equals("pacificrim")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 95;
                                                    }
                                                    break;
                                                case -1554255044:
                                                    if (!str3.equals("vernee_M5")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 130;
                                                    }
                                                    break;
                                                case -1481772737:
                                                    if (!str3.equals("panell_dl")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 97;
                                                    }
                                                    break;
                                                case -1481772730:
                                                    if (!str3.equals("panell_ds")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 98;
                                                    }
                                                    break;
                                                case -1481772729:
                                                    if (!str3.equals("panell_dt")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 99;
                                                    }
                                                    break;
                                                case -1320080169:
                                                    if (!str3.equals("GiONEE_GBL7319")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 52;
                                                    }
                                                    break;
                                                case -1217592143:
                                                    if (!str3.equals("BRAVIA_ATV2")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 18;
                                                    }
                                                    break;
                                                case -1180384755:
                                                    if (!str3.equals("iris60")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 70;
                                                    }
                                                    break;
                                                case -1139198265:
                                                    if (!str3.equals("Slate_Pro")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 118;
                                                    }
                                                    break;
                                                case -1052835013:
                                                    if (!str3.equals("namath")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 87;
                                                    }
                                                    break;
                                                case -993250464:
                                                    if (!str3.equals("A10-70F")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 5;
                                                    }
                                                    break;
                                                case -993250458:
                                                    if (!str3.equals("A10-70L")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 6;
                                                    }
                                                    break;
                                                case -965403638:
                                                    if (!str3.equals("s905x018")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 120;
                                                    }
                                                    break;
                                                case -958336948:
                                                    if (!str3.equals("ELUGA_Ray_X")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 34;
                                                    }
                                                    break;
                                                case -879245230:
                                                    if (!str3.equals("tcl_eu")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 126;
                                                    }
                                                    break;
                                                case -842500323:
                                                    if (!str3.equals("nicklaus_f")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 88;
                                                    }
                                                    break;
                                                case -821392978:
                                                    if (!str3.equals("A7000-a")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 9;
                                                    }
                                                    break;
                                                case -797483286:
                                                    if (!str3.equals("SVP-DTV15")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 119;
                                                    }
                                                    break;
                                                case -794946968:
                                                    if (!str3.equals("watson")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 131;
                                                    }
                                                    break;
                                                case -788334647:
                                                    if (!str3.equals("whyred")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 132;
                                                    }
                                                    break;
                                                case -782144577:
                                                    if (!str3.equals("OnePlus5T")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 91;
                                                    }
                                                    break;
                                                case -575125681:
                                                    if (!str3.equals("GiONEE_CBL7513")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 51;
                                                    }
                                                    break;
                                                case -521118391:
                                                    if (!str3.equals("GIONEE_GBL7360")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 53;
                                                    }
                                                    break;
                                                case -430914369:
                                                    if (!str3.equals("Pixi4-7_3G")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 105;
                                                    }
                                                    break;
                                                case -290434366:
                                                    if (!str3.equals("taido_row")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 121;
                                                    }
                                                    break;
                                                case -282781963:
                                                    if (!str3.equals("BLACK-1X")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 17;
                                                    }
                                                    break;
                                                case -277133239:
                                                    if (!str3.equals("Z12_PRO")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 138;
                                                    }
                                                    break;
                                                case -173639913:
                                                    if (!str3.equals("ELUGA_A3_Pro")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 31;
                                                    }
                                                    break;
                                                case -56598463:
                                                    if (!str3.equals("woods_fn")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 134;
                                                    }
                                                    break;
                                                case 2126:
                                                    if (!str3.equals("C1")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 20;
                                                    }
                                                    break;
                                                case 2564:
                                                    if (!str3.equals("Q5")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 113;
                                                    }
                                                    break;
                                                case 2715:
                                                    if (!str3.equals("V1")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 127;
                                                    }
                                                    break;
                                                case 2719:
                                                    if (!str3.equals("V5")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 129;
                                                    }
                                                    break;
                                                case 3091:
                                                    if (!str3.equals("b5")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 16;
                                                    }
                                                    break;
                                                case 3483:
                                                    if (!str3.equals("mh")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 84;
                                                    }
                                                    break;
                                                case 73405:
                                                    if (!str3.equals("JGZ")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 73;
                                                    }
                                                    break;
                                                case 75537:
                                                    if (!str3.equals("M04")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 79;
                                                    }
                                                    break;
                                                case 75739:
                                                    if (!str3.equals("M5c")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 80;
                                                    }
                                                    break;
                                                case 76779:
                                                    if (!str3.equals("MX6")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 86;
                                                    }
                                                    break;
                                                case 78669:
                                                    if (!str3.equals("P85")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 94;
                                                    }
                                                    break;
                                                case 79305:
                                                    if (!str3.equals("PLE")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 107;
                                                    }
                                                    break;
                                                case 80618:
                                                    if (!str3.equals("QX1")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 115;
                                                    }
                                                    break;
                                                case 88274:
                                                    if (!str3.equals("Z80")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 139;
                                                    }
                                                    break;
                                                case 98846:
                                                    if (!str3.equals("cv1")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 26;
                                                    }
                                                    break;
                                                case 98848:
                                                    if (!str3.equals("cv3")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 27;
                                                    }
                                                    break;
                                                case 99329:
                                                    if (!str3.equals("deb")) {
                                                        b3 = -1;
                                                    }
                                                    break;
                                                case 101481:
                                                    if (!str3.equals("flo")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 49;
                                                    }
                                                    break;
                                                case 1513190:
                                                    if (!str3.equals("1601")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 0;
                                                    }
                                                    break;
                                                case 1514184:
                                                    if (!str3.equals("1713")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 1;
                                                    }
                                                    break;
                                                case 1514185:
                                                    if (!str3.equals("1714")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 2;
                                                    }
                                                    break;
                                                case 2133089:
                                                    if (!str3.equals("F01H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 36;
                                                    }
                                                    break;
                                                case 2133091:
                                                    if (!str3.equals("F01J")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 37;
                                                    }
                                                    break;
                                                case 2133120:
                                                    if (!str3.equals("F02H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 38;
                                                    }
                                                    break;
                                                case 2133151:
                                                    if (!str3.equals("F03H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 39;
                                                    }
                                                    break;
                                                case 2133182:
                                                    if (!str3.equals("F04H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 40;
                                                    }
                                                    break;
                                                case 2133184:
                                                    if (!str3.equals("F04J")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 41;
                                                    }
                                                    break;
                                                case 2436959:
                                                    if (!str3.equals("P681")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 93;
                                                    }
                                                    break;
                                                case 2463773:
                                                    if (!str3.equals("Q350")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 109;
                                                    }
                                                    break;
                                                case 2464648:
                                                    if (!str3.equals("Q427")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 111;
                                                    }
                                                    break;
                                                case 2689555:
                                                    if (!str3.equals("XE2X")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 136;
                                                    }
                                                    break;
                                                case 3154429:
                                                    if (!str3.equals("fugu")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 50;
                                                    }
                                                    break;
                                                case 3284551:
                                                    if (!str3.equals("kate")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 75;
                                                    }
                                                    break;
                                                case 3351335:
                                                    if (!str3.equals("mido")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 85;
                                                    }
                                                    break;
                                                case 3386211:
                                                    if (!str3.equals("p212")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 92;
                                                    }
                                                    break;
                                                case 41325051:
                                                    if (!str3.equals("MEIZU_M5")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 83;
                                                    }
                                                    break;
                                                case 51349633:
                                                    if (!str3.equals("601LV")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 3;
                                                    }
                                                    break;
                                                case 51350594:
                                                    if (!str3.equals("602LV")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 4;
                                                    }
                                                    break;
                                                case 55178625:
                                                    if (!str3.equals("Aura_Note_2")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 15;
                                                    }
                                                    break;
                                                case 61542055:
                                                    if (!str3.equals("A1601")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 7;
                                                    }
                                                    break;
                                                case 65355429:
                                                    if (!str3.equals("E5643")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 30;
                                                    }
                                                    break;
                                                case 66214468:
                                                    if (!str3.equals("F3111")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 42;
                                                    }
                                                    break;
                                                case 66214470:
                                                    if (!str3.equals("F3113")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 43;
                                                    }
                                                    break;
                                                case 66214473:
                                                    if (!str3.equals("F3116")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 44;
                                                    }
                                                    break;
                                                case 66215429:
                                                    if (!str3.equals("F3211")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 45;
                                                    }
                                                    break;
                                                case 66215431:
                                                    if (!str3.equals("F3213")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 46;
                                                    }
                                                    break;
                                                case 66215433:
                                                    if (!str3.equals("F3215")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 47;
                                                    }
                                                    break;
                                                case 66216390:
                                                    if (!str3.equals("F3311")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 48;
                                                    }
                                                    break;
                                                case 76402249:
                                                    if (!str3.equals("PRO7S")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 108;
                                                    }
                                                    break;
                                                case 76404105:
                                                    if (!str3.equals("Q4260")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 110;
                                                    }
                                                    break;
                                                case 76404911:
                                                    if (!str3.equals("Q4310")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 112;
                                                    }
                                                    break;
                                                case 80963634:
                                                    if (!str3.equals("V23GB")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 128;
                                                    }
                                                    break;
                                                case 82882791:
                                                    if (!str3.equals("X3_HK")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 135;
                                                    }
                                                    break;
                                                case 98715550:
                                                    if (!str3.equals("i9031")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 67;
                                                    }
                                                    break;
                                                case 101370885:
                                                    if (!str3.equals("l5460")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 76;
                                                    }
                                                    break;
                                                case 102844228:
                                                    if (!str3.equals("le_x6")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 77;
                                                    }
                                                    break;
                                                case 165221241:
                                                    if (!str3.equals("A2016a40")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 8;
                                                    }
                                                    break;
                                                case 182191441:
                                                    if (!str3.equals("CPY83_I00")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 25;
                                                    }
                                                    break;
                                                case 245388979:
                                                    if (!str3.equals("marino_f")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 82;
                                                    }
                                                    break;
                                                case 287431619:
                                                    if (!str3.equals("griffin")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 60;
                                                    }
                                                    break;
                                                case 307593612:
                                                    if (!str3.equals("A7010a48")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 11;
                                                    }
                                                    break;
                                                case 308517133:
                                                    if (!str3.equals("A7020a48")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 12;
                                                    }
                                                    break;
                                                case 316215098:
                                                    if (!str3.equals("TB3-730F")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 122;
                                                    }
                                                    break;
                                                case 316215116:
                                                    if (!str3.equals("TB3-730X")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 123;
                                                    }
                                                    break;
                                                case 316246811:
                                                    if (!str3.equals("TB3-850F")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 124;
                                                    }
                                                    break;
                                                case 316246818:
                                                    if (!str3.equals("TB3-850M")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 125;
                                                    }
                                                    break;
                                                case 407160593:
                                                    if (!str3.equals("Pixi5-10_4G")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 106;
                                                    }
                                                    break;
                                                case 507412548:
                                                    if (!str3.equals("QM16XE_U")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 114;
                                                    }
                                                    break;
                                                case 793982701:
                                                    if (!str3.equals("GIONEE_WBL5708")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 57;
                                                    }
                                                    break;
                                                case 794038622:
                                                    if (!str3.equals("GIONEE_WBL7365")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 58;
                                                    }
                                                    break;
                                                case 794040393:
                                                    if (!str3.equals("GIONEE_WBL7519")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 59;
                                                    }
                                                    break;
                                                case 835649806:
                                                    if (!str3.equals("manning")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 81;
                                                    }
                                                    break;
                                                case 917340916:
                                                    if (!str3.equals("A7000plus")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 10;
                                                    }
                                                    break;
                                                case 958008161:
                                                    if (!str3.equals("j2xlteins")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 72;
                                                    }
                                                    break;
                                                case 1060579533:
                                                    if (!str3.equals("panell_d")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 96;
                                                    }
                                                    break;
                                                case 1150207623:
                                                    if (!str3.equals("LS-5017")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 78;
                                                    }
                                                    break;
                                                case 1176899427:
                                                    if (!str3.equals("itel_S41")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 71;
                                                    }
                                                    break;
                                                case 1280332038:
                                                    if (!str3.equals("hwALE-H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 62;
                                                    }
                                                    break;
                                                case 1306947716:
                                                    if (!str3.equals("EverStar_S")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 35;
                                                    }
                                                    break;
                                                case 1349174697:
                                                    if (!str3.equals("htc_e56ml_dtul")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = kotlin.io.encoding.Base64.padSymbol;
                                                    }
                                                    break;
                                                case 1522194893:
                                                    if (!str3.equals("woods_f")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 133;
                                                    }
                                                    break;
                                                case 1691543273:
                                                    if (!str3.equals("CPH1609")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 23;
                                                    }
                                                    break;
                                                case 1691544261:
                                                    if (!str3.equals("CPH1715")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 24;
                                                    }
                                                    break;
                                                case 1709443163:
                                                    if (!str3.equals("iball8735_9806")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 68;
                                                    }
                                                    break;
                                                case 1865889110:
                                                    if (!str3.equals("santoni")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 117;
                                                    }
                                                    break;
                                                case 1906253259:
                                                    if (!str3.equals("PB2-670M")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 100;
                                                    }
                                                    break;
                                                case 1977196784:
                                                    if (!str3.equals("Infinix-X572")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 69;
                                                    }
                                                    break;
                                                case 2006372676:
                                                    if (!str3.equals("BRAVIA_ATV3_4K")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 19;
                                                    }
                                                    break;
                                                case 2019281702:
                                                    if (!str3.equals("DM-01K")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 29;
                                                    }
                                                    break;
                                                case 2029784656:
                                                    if (!str3.equals("HWBLN-H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = okio.Utf8.REPLACEMENT_BYTE;
                                                    }
                                                    break;
                                                case 2030379515:
                                                    if (!str3.equals("HWCAM-H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 64;
                                                    }
                                                    break;
                                                case 2033393791:
                                                    if (!str3.equals("ASUS_X00AD_2")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 14;
                                                    }
                                                    break;
                                                case 2047190025:
                                                    if (!str3.equals("ELUGA_Note")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 32;
                                                    }
                                                    break;
                                                case 2047252157:
                                                    if (!str3.equals("ELUGA_Prim")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 33;
                                                    }
                                                    break;
                                                case 2048319463:
                                                    if (!str3.equals("HWVNS-H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 65;
                                                    }
                                                    break;
                                                case 2048855701:
                                                    if (!str3.equals("HWWAS-H")) {
                                                        b3 = -1;
                                                    } else {
                                                        b3 = 66;
                                                    }
                                                    break;
                                                default:
                                                    b3 = -1;
                                                    break;
                                            }
                                            switch (b3) {
                                                default:
                                                    if (str2.hashCode() == -594534941 && str2.equals("JSN-L21")) {
                                                        b4 = 0;
                                                    }
                                                    if (b4 == 0) {
                                                    }
                                                case 0:
                                                case 1:
                                                case 2:
                                                case 3:
                                                case 4:
                                                case 5:
                                                case 6:
                                                case 7:
                                                case 8:
                                                case 9:
                                                case 10:
                                                case 11:
                                                case 12:
                                                case 13:
                                                case 14:
                                                case 15:
                                                case 16:
                                                case 17:
                                                case 18:
                                                case 19:
                                                case 20:
                                                case 21:
                                                case 22:
                                                case 23:
                                                case 24:
                                                case 25:
                                                case 26:
                                                case 27:
                                                case 28:
                                                case 29:
                                                case 30:
                                                case 31:
                                                case 32:
                                                case 33:
                                                case 34:
                                                case 35:
                                                case 36:
                                                case 37:
                                                case 38:
                                                case 39:
                                                case 40:
                                                case 41:
                                                case 42:
                                                case 43:
                                                case 44:
                                                case 45:
                                                case 46:
                                                case 47:
                                                case 48:
                                                case 49:
                                                case 50:
                                                case 51:
                                                case 52:
                                                case 53:
                                                case 54:
                                                case 55:
                                                case 56:
                                                case 57:
                                                case 58:
                                                case 59:
                                                case 60:
                                                case 61:
                                                case 62:
                                                case 63:
                                                case 64:
                                                case 65:
                                                case 66:
                                                case 67:
                                                case 68:
                                                case 69:
                                                case 70:
                                                case 71:
                                                case 72:
                                                case 73:
                                                case 74:
                                                case 75:
                                                case 76:
                                                case 77:
                                                case 78:
                                                case 79:
                                                case 80:
                                                case 81:
                                                case 82:
                                                case 83:
                                                case 84:
                                                case 85:
                                                case 86:
                                                case 87:
                                                case 88:
                                                case 89:
                                                case 90:
                                                case 91:
                                                case 92:
                                                case 93:
                                                case 94:
                                                case 95:
                                                case 96:
                                                case 97:
                                                case 98:
                                                case 99:
                                                case 100:
                                                case 101:
                                                case 102:
                                                case 103:
                                                case 104:
                                                case 105:
                                                case 106:
                                                case 107:
                                                case 108:
                                                case 109:
                                                case 110:
                                                case 111:
                                                case 112:
                                                case 113:
                                                case 114:
                                                case 115:
                                                case 116:
                                                case 117:
                                                case 118:
                                                case 119:
                                                case 120:
                                                case 121:
                                                case 122:
                                                case 123:
                                                case 124:
                                                case 125:
                                                case 126:
                                                case 127:
                                                case 128:
                                                case 129:
                                                case 130:
                                                case org.objectweb.asm.Opcodes.LXOR /* 131 */:
                                                case org.objectweb.asm.Opcodes.IINC /* 132 */:
                                                case org.objectweb.asm.Opcodes.I2L /* 133 */:
                                                case 134:
                                                case 135:
                                                case 136:
                                                case org.objectweb.asm.Opcodes.L2F /* 137 */:
                                                case 138:
                                                case 139:
                                                    z = true;
                                                    break;
                                            }
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                        z = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                            z = true;
                            break;
                    }
                } else if (com.google.android.gms.internal.ads.zzei.zza <= 27) {
                    str2 = com.google.android.gms.internal.ads.zzei.zzd;
                    switch (str2.hashCode()) {
                        case -349662828:
                            if (!str2.equals("AFTJMST12")) {
                                b = -1;
                            } else {
                                b = 6;
                            }
                            break;
                        case -321033677:
                            if (!str2.equals("AFTKMST12")) {
                                b = -1;
                            } else {
                                b = 7;
                            }
                            break;
                        case 2006354:
                            if (!str2.equals("AFTA")) {
                                b = -1;
                            } else {
                                b = 0;
                            }
                            break;
                        case 2006367:
                            if (!str2.equals("AFTN")) {
                                b = -1;
                            } else {
                                b = 1;
                            }
                            break;
                        case 2006371:
                            if (!str2.equals("AFTR")) {
                                b = -1;
                            } else {
                                b = 2;
                            }
                            break;
                        case 1785421873:
                            if (!str2.equals("AFTEU011")) {
                                b = -1;
                            } else {
                                b = 3;
                            }
                            break;
                        case 1785421876:
                            if (!str2.equals("AFTEU014")) {
                                b = -1;
                            } else {
                                b = 4;
                            }
                            break;
                        case 1798172390:
                            if (!str2.equals("AFTSO001")) {
                                b = -1;
                            } else {
                                b = 8;
                            }
                            break;
                        case 2119412532:
                            if (!str2.equals("AFTEUFF014")) {
                                b = -1;
                            } else {
                                b = 5;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        default:
                            if (com.google.android.gms.internal.ads.zzei.zza <= 26) {
                                str3 = com.google.android.gms.internal.ads.zzei.zzb;
                                switch (str3.hashCode()) {
                                    case -2144781245:
                                        if (!str3.equals("GIONEE_SWW1609")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 54;
                                        }
                                        break;
                                    case -2144781185:
                                        if (!str3.equals("GIONEE_SWW1627")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 55;
                                        }
                                        break;
                                    case -2144781160:
                                        if (!str3.equals("GIONEE_SWW1631")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 56;
                                        }
                                        break;
                                    case -2097309513:
                                        if (!str3.equals("K50a40")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 74;
                                        }
                                        break;
                                    case -2022874474:
                                        if (!str3.equals("CP8676_I02")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 22;
                                        }
                                        break;
                                    case -1978993182:
                                        if (!str3.equals("NX541J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 89;
                                        }
                                        break;
                                    case -1978990237:
                                        if (!str3.equals("NX573J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 90;
                                        }
                                        break;
                                    case -1936688988:
                                        if (!str3.equals("PGN528")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 101;
                                        }
                                        break;
                                    case -1936688066:
                                        if (!str3.equals("PGN610")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 102;
                                        }
                                        break;
                                    case -1936688065:
                                        if (!str3.equals("PGN611")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 103;
                                        }
                                        break;
                                    case -1931988508:
                                        if (!str3.equals("AquaPowerM")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 13;
                                        }
                                        break;
                                    case -1885099851:
                                        if (!str3.equals("RAIJIN")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 116;
                                        }
                                        break;
                                    case -1696512866:
                                        if (!str3.equals("XT1663")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 137;
                                        }
                                        break;
                                    case -1680025915:
                                        if (!str3.equals("ComioS1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 21;
                                        }
                                        break;
                                    case -1615810839:
                                        if (!str3.equals("Phantom6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 104;
                                        }
                                        break;
                                    case -1600724499:
                                        if (!str3.equals("pacificrim")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 95;
                                        }
                                        break;
                                    case -1554255044:
                                        if (!str3.equals("vernee_M5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 130;
                                        }
                                        break;
                                    case -1481772737:
                                        if (!str3.equals("panell_dl")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 97;
                                        }
                                        break;
                                    case -1481772730:
                                        if (!str3.equals("panell_ds")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 98;
                                        }
                                        break;
                                    case -1481772729:
                                        if (!str3.equals("panell_dt")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 99;
                                        }
                                        break;
                                    case -1320080169:
                                        if (!str3.equals("GiONEE_GBL7319")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 52;
                                        }
                                        break;
                                    case -1217592143:
                                        if (!str3.equals("BRAVIA_ATV2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 18;
                                        }
                                        break;
                                    case -1180384755:
                                        if (!str3.equals("iris60")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 70;
                                        }
                                        break;
                                    case -1139198265:
                                        if (!str3.equals("Slate_Pro")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 118;
                                        }
                                        break;
                                    case -1052835013:
                                        if (!str3.equals("namath")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 87;
                                        }
                                        break;
                                    case -993250464:
                                        if (!str3.equals("A10-70F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 5;
                                        }
                                        break;
                                    case -993250458:
                                        if (!str3.equals("A10-70L")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 6;
                                        }
                                        break;
                                    case -965403638:
                                        if (!str3.equals("s905x018")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 120;
                                        }
                                        break;
                                    case -958336948:
                                        if (!str3.equals("ELUGA_Ray_X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 34;
                                        }
                                        break;
                                    case -879245230:
                                        if (!str3.equals("tcl_eu")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 126;
                                        }
                                        break;
                                    case -842500323:
                                        if (!str3.equals("nicklaus_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 88;
                                        }
                                        break;
                                    case -821392978:
                                        if (!str3.equals("A7000-a")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 9;
                                        }
                                        break;
                                    case -797483286:
                                        if (!str3.equals("SVP-DTV15")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 119;
                                        }
                                        break;
                                    case -794946968:
                                        if (!str3.equals("watson")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 131;
                                        }
                                        break;
                                    case -788334647:
                                        if (!str3.equals("whyred")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 132;
                                        }
                                        break;
                                    case -782144577:
                                        if (!str3.equals("OnePlus5T")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 91;
                                        }
                                        break;
                                    case -575125681:
                                        if (!str3.equals("GiONEE_CBL7513")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 51;
                                        }
                                        break;
                                    case -521118391:
                                        if (!str3.equals("GIONEE_GBL7360")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 53;
                                        }
                                        break;
                                    case -430914369:
                                        if (!str3.equals("Pixi4-7_3G")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 105;
                                        }
                                        break;
                                    case -290434366:
                                        if (!str3.equals("taido_row")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 121;
                                        }
                                        break;
                                    case -282781963:
                                        if (!str3.equals("BLACK-1X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 17;
                                        }
                                        break;
                                    case -277133239:
                                        if (!str3.equals("Z12_PRO")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 138;
                                        }
                                        break;
                                    case -173639913:
                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 31;
                                        }
                                        break;
                                    case -56598463:
                                        if (!str3.equals("woods_fn")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 134;
                                        }
                                        break;
                                    case 2126:
                                        if (!str3.equals("C1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 20;
                                        }
                                        break;
                                    case 2564:
                                        if (!str3.equals("Q5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 113;
                                        }
                                        break;
                                    case 2715:
                                        if (!str3.equals("V1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 127;
                                        }
                                        break;
                                    case 2719:
                                        if (!str3.equals("V5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 129;
                                        }
                                        break;
                                    case 3091:
                                        if (!str3.equals("b5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 16;
                                        }
                                        break;
                                    case 3483:
                                        if (!str3.equals("mh")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 84;
                                        }
                                        break;
                                    case 73405:
                                        if (!str3.equals("JGZ")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 73;
                                        }
                                        break;
                                    case 75537:
                                        if (!str3.equals("M04")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 79;
                                        }
                                        break;
                                    case 75739:
                                        if (!str3.equals("M5c")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 80;
                                        }
                                        break;
                                    case 76779:
                                        if (!str3.equals("MX6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 86;
                                        }
                                        break;
                                    case 78669:
                                        if (!str3.equals("P85")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 94;
                                        }
                                        break;
                                    case 79305:
                                        if (!str3.equals("PLE")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 107;
                                        }
                                        break;
                                    case 80618:
                                        if (!str3.equals("QX1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 115;
                                        }
                                        break;
                                    case 88274:
                                        if (!str3.equals("Z80")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 139;
                                        }
                                        break;
                                    case 98846:
                                        if (!str3.equals("cv1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 26;
                                        }
                                        break;
                                    case 98848:
                                        if (!str3.equals("cv3")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 27;
                                        }
                                        break;
                                    case 99329:
                                        if (!str3.equals("deb")) {
                                            b3 = -1;
                                        }
                                        break;
                                    case 101481:
                                        if (!str3.equals("flo")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 49;
                                        }
                                        break;
                                    case 1513190:
                                        if (!str3.equals("1601")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 0;
                                        }
                                        break;
                                    case 1514184:
                                        if (!str3.equals("1713")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 1;
                                        }
                                        break;
                                    case 1514185:
                                        if (!str3.equals("1714")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 2;
                                        }
                                        break;
                                    case 2133089:
                                        if (!str3.equals("F01H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 36;
                                        }
                                        break;
                                    case 2133091:
                                        if (!str3.equals("F01J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 37;
                                        }
                                        break;
                                    case 2133120:
                                        if (!str3.equals("F02H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 38;
                                        }
                                        break;
                                    case 2133151:
                                        if (!str3.equals("F03H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 39;
                                        }
                                        break;
                                    case 2133182:
                                        if (!str3.equals("F04H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 40;
                                        }
                                        break;
                                    case 2133184:
                                        if (!str3.equals("F04J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 41;
                                        }
                                        break;
                                    case 2436959:
                                        if (!str3.equals("P681")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 93;
                                        }
                                        break;
                                    case 2463773:
                                        if (!str3.equals("Q350")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 109;
                                        }
                                        break;
                                    case 2464648:
                                        if (!str3.equals("Q427")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 111;
                                        }
                                        break;
                                    case 2689555:
                                        if (!str3.equals("XE2X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 136;
                                        }
                                        break;
                                    case 3154429:
                                        if (!str3.equals("fugu")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 50;
                                        }
                                        break;
                                    case 3284551:
                                        if (!str3.equals("kate")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 75;
                                        }
                                        break;
                                    case 3351335:
                                        if (!str3.equals("mido")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 85;
                                        }
                                        break;
                                    case 3386211:
                                        if (!str3.equals("p212")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 92;
                                        }
                                        break;
                                    case 41325051:
                                        if (!str3.equals("MEIZU_M5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 83;
                                        }
                                        break;
                                    case 51349633:
                                        if (!str3.equals("601LV")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 3;
                                        }
                                        break;
                                    case 51350594:
                                        if (!str3.equals("602LV")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 4;
                                        }
                                        break;
                                    case 55178625:
                                        if (!str3.equals("Aura_Note_2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 15;
                                        }
                                        break;
                                    case 61542055:
                                        if (!str3.equals("A1601")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 7;
                                        }
                                        break;
                                    case 65355429:
                                        if (!str3.equals("E5643")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 30;
                                        }
                                        break;
                                    case 66214468:
                                        if (!str3.equals("F3111")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 42;
                                        }
                                        break;
                                    case 66214470:
                                        if (!str3.equals("F3113")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 43;
                                        }
                                        break;
                                    case 66214473:
                                        if (!str3.equals("F3116")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 44;
                                        }
                                        break;
                                    case 66215429:
                                        if (!str3.equals("F3211")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 45;
                                        }
                                        break;
                                    case 66215431:
                                        if (!str3.equals("F3213")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 46;
                                        }
                                        break;
                                    case 66215433:
                                        if (!str3.equals("F3215")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 47;
                                        }
                                        break;
                                    case 66216390:
                                        if (!str3.equals("F3311")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 48;
                                        }
                                        break;
                                    case 76402249:
                                        if (!str3.equals("PRO7S")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 108;
                                        }
                                        break;
                                    case 76404105:
                                        if (!str3.equals("Q4260")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 110;
                                        }
                                        break;
                                    case 76404911:
                                        if (!str3.equals("Q4310")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 112;
                                        }
                                        break;
                                    case 80963634:
                                        if (!str3.equals("V23GB")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 128;
                                        }
                                        break;
                                    case 82882791:
                                        if (!str3.equals("X3_HK")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 135;
                                        }
                                        break;
                                    case 98715550:
                                        if (!str3.equals("i9031")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 67;
                                        }
                                        break;
                                    case 101370885:
                                        if (!str3.equals("l5460")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 76;
                                        }
                                        break;
                                    case 102844228:
                                        if (!str3.equals("le_x6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 77;
                                        }
                                        break;
                                    case 165221241:
                                        if (!str3.equals("A2016a40")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 8;
                                        }
                                        break;
                                    case 182191441:
                                        if (!str3.equals("CPY83_I00")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 25;
                                        }
                                        break;
                                    case 245388979:
                                        if (!str3.equals("marino_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 82;
                                        }
                                        break;
                                    case 287431619:
                                        if (!str3.equals("griffin")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 60;
                                        }
                                        break;
                                    case 307593612:
                                        if (!str3.equals("A7010a48")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 11;
                                        }
                                        break;
                                    case 308517133:
                                        if (!str3.equals("A7020a48")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 12;
                                        }
                                        break;
                                    case 316215098:
                                        if (!str3.equals("TB3-730F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 122;
                                        }
                                        break;
                                    case 316215116:
                                        if (!str3.equals("TB3-730X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 123;
                                        }
                                        break;
                                    case 316246811:
                                        if (!str3.equals("TB3-850F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 124;
                                        }
                                        break;
                                    case 316246818:
                                        if (!str3.equals("TB3-850M")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 125;
                                        }
                                        break;
                                    case 407160593:
                                        if (!str3.equals("Pixi5-10_4G")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 106;
                                        }
                                        break;
                                    case 507412548:
                                        if (!str3.equals("QM16XE_U")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 114;
                                        }
                                        break;
                                    case 793982701:
                                        if (!str3.equals("GIONEE_WBL5708")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 57;
                                        }
                                        break;
                                    case 794038622:
                                        if (!str3.equals("GIONEE_WBL7365")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 58;
                                        }
                                        break;
                                    case 794040393:
                                        if (!str3.equals("GIONEE_WBL7519")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 59;
                                        }
                                        break;
                                    case 835649806:
                                        if (!str3.equals("manning")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 81;
                                        }
                                        break;
                                    case 917340916:
                                        if (!str3.equals("A7000plus")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 10;
                                        }
                                        break;
                                    case 958008161:
                                        if (!str3.equals("j2xlteins")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 72;
                                        }
                                        break;
                                    case 1060579533:
                                        if (!str3.equals("panell_d")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 96;
                                        }
                                        break;
                                    case 1150207623:
                                        if (!str3.equals("LS-5017")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 78;
                                        }
                                        break;
                                    case 1176899427:
                                        if (!str3.equals("itel_S41")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 71;
                                        }
                                        break;
                                    case 1280332038:
                                        if (!str3.equals("hwALE-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 62;
                                        }
                                        break;
                                    case 1306947716:
                                        if (!str3.equals("EverStar_S")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 35;
                                        }
                                        break;
                                    case 1349174697:
                                        if (!str3.equals("htc_e56ml_dtul")) {
                                            b3 = -1;
                                        } else {
                                            b3 = kotlin.io.encoding.Base64.padSymbol;
                                        }
                                        break;
                                    case 1522194893:
                                        if (!str3.equals("woods_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 133;
                                        }
                                        break;
                                    case 1691543273:
                                        if (!str3.equals("CPH1609")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 23;
                                        }
                                        break;
                                    case 1691544261:
                                        if (!str3.equals("CPH1715")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 24;
                                        }
                                        break;
                                    case 1709443163:
                                        if (!str3.equals("iball8735_9806")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 68;
                                        }
                                        break;
                                    case 1865889110:
                                        if (!str3.equals("santoni")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 117;
                                        }
                                        break;
                                    case 1906253259:
                                        if (!str3.equals("PB2-670M")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 100;
                                        }
                                        break;
                                    case 1977196784:
                                        if (!str3.equals("Infinix-X572")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 69;
                                        }
                                        break;
                                    case 2006372676:
                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 19;
                                        }
                                        break;
                                    case 2019281702:
                                        if (!str3.equals("DM-01K")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 29;
                                        }
                                        break;
                                    case 2029784656:
                                        if (!str3.equals("HWBLN-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = okio.Utf8.REPLACEMENT_BYTE;
                                        }
                                        break;
                                    case 2030379515:
                                        if (!str3.equals("HWCAM-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 64;
                                        }
                                        break;
                                    case 2033393791:
                                        if (!str3.equals("ASUS_X00AD_2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 14;
                                        }
                                        break;
                                    case 2047190025:
                                        if (!str3.equals("ELUGA_Note")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 32;
                                        }
                                        break;
                                    case 2047252157:
                                        if (!str3.equals("ELUGA_Prim")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 33;
                                        }
                                        break;
                                    case 2048319463:
                                        if (!str3.equals("HWVNS-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 65;
                                        }
                                        break;
                                    case 2048855701:
                                        if (!str3.equals("HWWAS-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 66;
                                        }
                                        break;
                                    default:
                                        b3 = -1;
                                        break;
                                }
                                switch (b3) {
                                    default:
                                        if (str2.hashCode() == -594534941) {
                                            b4 = 0;
                                        }
                                        if (b4 == 0) {
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                    case 56:
                                    case 57:
                                    case 58:
                                    case 59:
                                    case 60:
                                    case 61:
                                    case 62:
                                    case 63:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case 69:
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 74:
                                    case 75:
                                    case 76:
                                    case 77:
                                    case 78:
                                    case 79:
                                    case 80:
                                    case 81:
                                    case 82:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                    case 87:
                                    case 88:
                                    case 89:
                                    case 90:
                                    case 91:
                                    case 92:
                                    case 93:
                                    case 94:
                                    case 95:
                                    case 96:
                                    case 97:
                                    case 98:
                                    case 99:
                                    case 100:
                                    case 101:
                                    case 102:
                                    case 103:
                                    case 104:
                                    case 105:
                                    case 106:
                                    case 107:
                                    case 108:
                                    case 109:
                                    case 110:
                                    case 111:
                                    case 112:
                                    case 113:
                                    case 114:
                                    case 115:
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                    case 120:
                                    case 121:
                                    case 122:
                                    case 123:
                                    case 124:
                                    case 125:
                                    case 126:
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case org.objectweb.asm.Opcodes.LXOR /* 131 */:
                                    case org.objectweb.asm.Opcodes.IINC /* 132 */:
                                    case org.objectweb.asm.Opcodes.I2L /* 133 */:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case org.objectweb.asm.Opcodes.L2F /* 137 */:
                                    case 138:
                                    case 139:
                                        z = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            z = true;
                            break;
                    }
                } else {
                    str2 = com.google.android.gms.internal.ads.zzei.zzd;
                    switch (str2.hashCode()) {
                        case -349662828:
                            if (!str2.equals("AFTJMST12")) {
                                b = -1;
                            } else {
                                b = 6;
                            }
                            break;
                        case -321033677:
                            if (!str2.equals("AFTKMST12")) {
                                b = -1;
                            } else {
                                b = 7;
                            }
                            break;
                        case 2006354:
                            if (!str2.equals("AFTA")) {
                                b = -1;
                            } else {
                                b = 0;
                            }
                            break;
                        case 2006367:
                            if (!str2.equals("AFTN")) {
                                b = -1;
                            } else {
                                b = 1;
                            }
                            break;
                        case 2006371:
                            if (!str2.equals("AFTR")) {
                                b = -1;
                            } else {
                                b = 2;
                            }
                            break;
                        case 1785421873:
                            if (!str2.equals("AFTEU011")) {
                                b = -1;
                            } else {
                                b = 3;
                            }
                            break;
                        case 1785421876:
                            if (!str2.equals("AFTEU014")) {
                                b = -1;
                            } else {
                                b = 4;
                            }
                            break;
                        case 1798172390:
                            if (!str2.equals("AFTSO001")) {
                                b = -1;
                            } else {
                                b = 8;
                            }
                            break;
                        case 2119412532:
                            if (!str2.equals("AFTEUFF014")) {
                                b = -1;
                            } else {
                                b = 5;
                            }
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        default:
                            if (com.google.android.gms.internal.ads.zzei.zza <= 26) {
                                str3 = com.google.android.gms.internal.ads.zzei.zzb;
                                switch (str3.hashCode()) {
                                    case -2144781245:
                                        if (!str3.equals("GIONEE_SWW1609")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 54;
                                        }
                                        break;
                                    case -2144781185:
                                        if (!str3.equals("GIONEE_SWW1627")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 55;
                                        }
                                        break;
                                    case -2144781160:
                                        if (!str3.equals("GIONEE_SWW1631")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 56;
                                        }
                                        break;
                                    case -2097309513:
                                        if (!str3.equals("K50a40")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 74;
                                        }
                                        break;
                                    case -2022874474:
                                        if (!str3.equals("CP8676_I02")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 22;
                                        }
                                        break;
                                    case -1978993182:
                                        if (!str3.equals("NX541J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 89;
                                        }
                                        break;
                                    case -1978990237:
                                        if (!str3.equals("NX573J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 90;
                                        }
                                        break;
                                    case -1936688988:
                                        if (!str3.equals("PGN528")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 101;
                                        }
                                        break;
                                    case -1936688066:
                                        if (!str3.equals("PGN610")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 102;
                                        }
                                        break;
                                    case -1936688065:
                                        if (!str3.equals("PGN611")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 103;
                                        }
                                        break;
                                    case -1931988508:
                                        if (!str3.equals("AquaPowerM")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 13;
                                        }
                                        break;
                                    case -1885099851:
                                        if (!str3.equals("RAIJIN")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 116;
                                        }
                                        break;
                                    case -1696512866:
                                        if (!str3.equals("XT1663")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 137;
                                        }
                                        break;
                                    case -1680025915:
                                        if (!str3.equals("ComioS1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 21;
                                        }
                                        break;
                                    case -1615810839:
                                        if (!str3.equals("Phantom6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 104;
                                        }
                                        break;
                                    case -1600724499:
                                        if (!str3.equals("pacificrim")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 95;
                                        }
                                        break;
                                    case -1554255044:
                                        if (!str3.equals("vernee_M5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 130;
                                        }
                                        break;
                                    case -1481772737:
                                        if (!str3.equals("panell_dl")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 97;
                                        }
                                        break;
                                    case -1481772730:
                                        if (!str3.equals("panell_ds")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 98;
                                        }
                                        break;
                                    case -1481772729:
                                        if (!str3.equals("panell_dt")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 99;
                                        }
                                        break;
                                    case -1320080169:
                                        if (!str3.equals("GiONEE_GBL7319")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 52;
                                        }
                                        break;
                                    case -1217592143:
                                        if (!str3.equals("BRAVIA_ATV2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 18;
                                        }
                                        break;
                                    case -1180384755:
                                        if (!str3.equals("iris60")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 70;
                                        }
                                        break;
                                    case -1139198265:
                                        if (!str3.equals("Slate_Pro")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 118;
                                        }
                                        break;
                                    case -1052835013:
                                        if (!str3.equals("namath")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 87;
                                        }
                                        break;
                                    case -993250464:
                                        if (!str3.equals("A10-70F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 5;
                                        }
                                        break;
                                    case -993250458:
                                        if (!str3.equals("A10-70L")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 6;
                                        }
                                        break;
                                    case -965403638:
                                        if (!str3.equals("s905x018")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 120;
                                        }
                                        break;
                                    case -958336948:
                                        if (!str3.equals("ELUGA_Ray_X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 34;
                                        }
                                        break;
                                    case -879245230:
                                        if (!str3.equals("tcl_eu")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 126;
                                        }
                                        break;
                                    case -842500323:
                                        if (!str3.equals("nicklaus_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 88;
                                        }
                                        break;
                                    case -821392978:
                                        if (!str3.equals("A7000-a")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 9;
                                        }
                                        break;
                                    case -797483286:
                                        if (!str3.equals("SVP-DTV15")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 119;
                                        }
                                        break;
                                    case -794946968:
                                        if (!str3.equals("watson")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 131;
                                        }
                                        break;
                                    case -788334647:
                                        if (!str3.equals("whyred")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 132;
                                        }
                                        break;
                                    case -782144577:
                                        if (!str3.equals("OnePlus5T")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 91;
                                        }
                                        break;
                                    case -575125681:
                                        if (!str3.equals("GiONEE_CBL7513")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 51;
                                        }
                                        break;
                                    case -521118391:
                                        if (!str3.equals("GIONEE_GBL7360")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 53;
                                        }
                                        break;
                                    case -430914369:
                                        if (!str3.equals("Pixi4-7_3G")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 105;
                                        }
                                        break;
                                    case -290434366:
                                        if (!str3.equals("taido_row")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 121;
                                        }
                                        break;
                                    case -282781963:
                                        if (!str3.equals("BLACK-1X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 17;
                                        }
                                        break;
                                    case -277133239:
                                        if (!str3.equals("Z12_PRO")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 138;
                                        }
                                        break;
                                    case -173639913:
                                        if (!str3.equals("ELUGA_A3_Pro")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 31;
                                        }
                                        break;
                                    case -56598463:
                                        if (!str3.equals("woods_fn")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 134;
                                        }
                                        break;
                                    case 2126:
                                        if (!str3.equals("C1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 20;
                                        }
                                        break;
                                    case 2564:
                                        if (!str3.equals("Q5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 113;
                                        }
                                        break;
                                    case 2715:
                                        if (!str3.equals("V1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 127;
                                        }
                                        break;
                                    case 2719:
                                        if (!str3.equals("V5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 129;
                                        }
                                        break;
                                    case 3091:
                                        if (!str3.equals("b5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 16;
                                        }
                                        break;
                                    case 3483:
                                        if (!str3.equals("mh")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 84;
                                        }
                                        break;
                                    case 73405:
                                        if (!str3.equals("JGZ")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 73;
                                        }
                                        break;
                                    case 75537:
                                        if (!str3.equals("M04")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 79;
                                        }
                                        break;
                                    case 75739:
                                        if (!str3.equals("M5c")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 80;
                                        }
                                        break;
                                    case 76779:
                                        if (!str3.equals("MX6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 86;
                                        }
                                        break;
                                    case 78669:
                                        if (!str3.equals("P85")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 94;
                                        }
                                        break;
                                    case 79305:
                                        if (!str3.equals("PLE")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 107;
                                        }
                                        break;
                                    case 80618:
                                        if (!str3.equals("QX1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 115;
                                        }
                                        break;
                                    case 88274:
                                        if (!str3.equals("Z80")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 139;
                                        }
                                        break;
                                    case 98846:
                                        if (!str3.equals("cv1")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 26;
                                        }
                                        break;
                                    case 98848:
                                        if (!str3.equals("cv3")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 27;
                                        }
                                        break;
                                    case 99329:
                                        if (!str3.equals("deb")) {
                                            b3 = -1;
                                        }
                                        break;
                                    case 101481:
                                        if (!str3.equals("flo")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 49;
                                        }
                                        break;
                                    case 1513190:
                                        if (!str3.equals("1601")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 0;
                                        }
                                        break;
                                    case 1514184:
                                        if (!str3.equals("1713")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 1;
                                        }
                                        break;
                                    case 1514185:
                                        if (!str3.equals("1714")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 2;
                                        }
                                        break;
                                    case 2133089:
                                        if (!str3.equals("F01H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 36;
                                        }
                                        break;
                                    case 2133091:
                                        if (!str3.equals("F01J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 37;
                                        }
                                        break;
                                    case 2133120:
                                        if (!str3.equals("F02H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 38;
                                        }
                                        break;
                                    case 2133151:
                                        if (!str3.equals("F03H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 39;
                                        }
                                        break;
                                    case 2133182:
                                        if (!str3.equals("F04H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 40;
                                        }
                                        break;
                                    case 2133184:
                                        if (!str3.equals("F04J")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 41;
                                        }
                                        break;
                                    case 2436959:
                                        if (!str3.equals("P681")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 93;
                                        }
                                        break;
                                    case 2463773:
                                        if (!str3.equals("Q350")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 109;
                                        }
                                        break;
                                    case 2464648:
                                        if (!str3.equals("Q427")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 111;
                                        }
                                        break;
                                    case 2689555:
                                        if (!str3.equals("XE2X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 136;
                                        }
                                        break;
                                    case 3154429:
                                        if (!str3.equals("fugu")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 50;
                                        }
                                        break;
                                    case 3284551:
                                        if (!str3.equals("kate")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 75;
                                        }
                                        break;
                                    case 3351335:
                                        if (!str3.equals("mido")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 85;
                                        }
                                        break;
                                    case 3386211:
                                        if (!str3.equals("p212")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 92;
                                        }
                                        break;
                                    case 41325051:
                                        if (!str3.equals("MEIZU_M5")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 83;
                                        }
                                        break;
                                    case 51349633:
                                        if (!str3.equals("601LV")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 3;
                                        }
                                        break;
                                    case 51350594:
                                        if (!str3.equals("602LV")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 4;
                                        }
                                        break;
                                    case 55178625:
                                        if (!str3.equals("Aura_Note_2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 15;
                                        }
                                        break;
                                    case 61542055:
                                        if (!str3.equals("A1601")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 7;
                                        }
                                        break;
                                    case 65355429:
                                        if (!str3.equals("E5643")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 30;
                                        }
                                        break;
                                    case 66214468:
                                        if (!str3.equals("F3111")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 42;
                                        }
                                        break;
                                    case 66214470:
                                        if (!str3.equals("F3113")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 43;
                                        }
                                        break;
                                    case 66214473:
                                        if (!str3.equals("F3116")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 44;
                                        }
                                        break;
                                    case 66215429:
                                        if (!str3.equals("F3211")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 45;
                                        }
                                        break;
                                    case 66215431:
                                        if (!str3.equals("F3213")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 46;
                                        }
                                        break;
                                    case 66215433:
                                        if (!str3.equals("F3215")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 47;
                                        }
                                        break;
                                    case 66216390:
                                        if (!str3.equals("F3311")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 48;
                                        }
                                        break;
                                    case 76402249:
                                        if (!str3.equals("PRO7S")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 108;
                                        }
                                        break;
                                    case 76404105:
                                        if (!str3.equals("Q4260")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 110;
                                        }
                                        break;
                                    case 76404911:
                                        if (!str3.equals("Q4310")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 112;
                                        }
                                        break;
                                    case 80963634:
                                        if (!str3.equals("V23GB")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 128;
                                        }
                                        break;
                                    case 82882791:
                                        if (!str3.equals("X3_HK")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 135;
                                        }
                                        break;
                                    case 98715550:
                                        if (!str3.equals("i9031")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 67;
                                        }
                                        break;
                                    case 101370885:
                                        if (!str3.equals("l5460")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 76;
                                        }
                                        break;
                                    case 102844228:
                                        if (!str3.equals("le_x6")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 77;
                                        }
                                        break;
                                    case 165221241:
                                        if (!str3.equals("A2016a40")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 8;
                                        }
                                        break;
                                    case 182191441:
                                        if (!str3.equals("CPY83_I00")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 25;
                                        }
                                        break;
                                    case 245388979:
                                        if (!str3.equals("marino_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 82;
                                        }
                                        break;
                                    case 287431619:
                                        if (!str3.equals("griffin")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 60;
                                        }
                                        break;
                                    case 307593612:
                                        if (!str3.equals("A7010a48")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 11;
                                        }
                                        break;
                                    case 308517133:
                                        if (!str3.equals("A7020a48")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 12;
                                        }
                                        break;
                                    case 316215098:
                                        if (!str3.equals("TB3-730F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 122;
                                        }
                                        break;
                                    case 316215116:
                                        if (!str3.equals("TB3-730X")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 123;
                                        }
                                        break;
                                    case 316246811:
                                        if (!str3.equals("TB3-850F")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 124;
                                        }
                                        break;
                                    case 316246818:
                                        if (!str3.equals("TB3-850M")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 125;
                                        }
                                        break;
                                    case 407160593:
                                        if (!str3.equals("Pixi5-10_4G")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 106;
                                        }
                                        break;
                                    case 507412548:
                                        if (!str3.equals("QM16XE_U")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 114;
                                        }
                                        break;
                                    case 793982701:
                                        if (!str3.equals("GIONEE_WBL5708")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 57;
                                        }
                                        break;
                                    case 794038622:
                                        if (!str3.equals("GIONEE_WBL7365")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 58;
                                        }
                                        break;
                                    case 794040393:
                                        if (!str3.equals("GIONEE_WBL7519")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 59;
                                        }
                                        break;
                                    case 835649806:
                                        if (!str3.equals("manning")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 81;
                                        }
                                        break;
                                    case 917340916:
                                        if (!str3.equals("A7000plus")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 10;
                                        }
                                        break;
                                    case 958008161:
                                        if (!str3.equals("j2xlteins")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 72;
                                        }
                                        break;
                                    case 1060579533:
                                        if (!str3.equals("panell_d")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 96;
                                        }
                                        break;
                                    case 1150207623:
                                        if (!str3.equals("LS-5017")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 78;
                                        }
                                        break;
                                    case 1176899427:
                                        if (!str3.equals("itel_S41")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 71;
                                        }
                                        break;
                                    case 1280332038:
                                        if (!str3.equals("hwALE-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 62;
                                        }
                                        break;
                                    case 1306947716:
                                        if (!str3.equals("EverStar_S")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 35;
                                        }
                                        break;
                                    case 1349174697:
                                        if (!str3.equals("htc_e56ml_dtul")) {
                                            b3 = -1;
                                        } else {
                                            b3 = kotlin.io.encoding.Base64.padSymbol;
                                        }
                                        break;
                                    case 1522194893:
                                        if (!str3.equals("woods_f")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 133;
                                        }
                                        break;
                                    case 1691543273:
                                        if (!str3.equals("CPH1609")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 23;
                                        }
                                        break;
                                    case 1691544261:
                                        if (!str3.equals("CPH1715")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 24;
                                        }
                                        break;
                                    case 1709443163:
                                        if (!str3.equals("iball8735_9806")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 68;
                                        }
                                        break;
                                    case 1865889110:
                                        if (!str3.equals("santoni")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 117;
                                        }
                                        break;
                                    case 1906253259:
                                        if (!str3.equals("PB2-670M")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 100;
                                        }
                                        break;
                                    case 1977196784:
                                        if (!str3.equals("Infinix-X572")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 69;
                                        }
                                        break;
                                    case 2006372676:
                                        if (!str3.equals("BRAVIA_ATV3_4K")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 19;
                                        }
                                        break;
                                    case 2019281702:
                                        if (!str3.equals("DM-01K")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 29;
                                        }
                                        break;
                                    case 2029784656:
                                        if (!str3.equals("HWBLN-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = okio.Utf8.REPLACEMENT_BYTE;
                                        }
                                        break;
                                    case 2030379515:
                                        if (!str3.equals("HWCAM-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 64;
                                        }
                                        break;
                                    case 2033393791:
                                        if (!str3.equals("ASUS_X00AD_2")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 14;
                                        }
                                        break;
                                    case 2047190025:
                                        if (!str3.equals("ELUGA_Note")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 32;
                                        }
                                        break;
                                    case 2047252157:
                                        if (!str3.equals("ELUGA_Prim")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 33;
                                        }
                                        break;
                                    case 2048319463:
                                        if (!str3.equals("HWVNS-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 65;
                                        }
                                        break;
                                    case 2048855701:
                                        if (!str3.equals("HWWAS-H")) {
                                            b3 = -1;
                                        } else {
                                            b3 = 66;
                                        }
                                        break;
                                    default:
                                        b3 = -1;
                                        break;
                                }
                                switch (b3) {
                                    default:
                                        if (str2.hashCode() == -594534941) {
                                            b4 = 0;
                                        }
                                        if (b4 == 0) {
                                        }
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                    case 12:
                                    case 13:
                                    case 14:
                                    case 15:
                                    case 16:
                                    case 17:
                                    case 18:
                                    case 19:
                                    case 20:
                                    case 21:
                                    case 22:
                                    case 23:
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28:
                                    case 29:
                                    case 30:
                                    case 31:
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                    case 40:
                                    case 41:
                                    case 42:
                                    case 43:
                                    case 44:
                                    case 45:
                                    case 46:
                                    case 47:
                                    case 48:
                                    case 49:
                                    case 50:
                                    case 51:
                                    case 52:
                                    case 53:
                                    case 54:
                                    case 55:
                                    case 56:
                                    case 57:
                                    case 58:
                                    case 59:
                                    case 60:
                                    case 61:
                                    case 62:
                                    case 63:
                                    case 64:
                                    case 65:
                                    case 66:
                                    case 67:
                                    case 68:
                                    case 69:
                                    case 70:
                                    case 71:
                                    case 72:
                                    case 73:
                                    case 74:
                                    case 75:
                                    case 76:
                                    case 77:
                                    case 78:
                                    case 79:
                                    case 80:
                                    case 81:
                                    case 82:
                                    case 83:
                                    case 84:
                                    case 85:
                                    case 86:
                                    case 87:
                                    case 88:
                                    case 89:
                                    case 90:
                                    case 91:
                                    case 92:
                                    case 93:
                                    case 94:
                                    case 95:
                                    case 96:
                                    case 97:
                                    case 98:
                                    case 99:
                                    case 100:
                                    case 101:
                                    case 102:
                                    case 103:
                                    case 104:
                                    case 105:
                                    case 106:
                                    case 107:
                                    case 108:
                                    case 109:
                                    case 110:
                                    case 111:
                                    case 112:
                                    case 113:
                                    case 114:
                                    case 115:
                                    case 116:
                                    case 117:
                                    case 118:
                                    case 119:
                                    case 120:
                                    case 121:
                                    case 122:
                                    case 123:
                                    case 124:
                                    case 125:
                                    case 126:
                                    case 127:
                                    case 128:
                                    case 129:
                                    case 130:
                                    case org.objectweb.asm.Opcodes.LXOR /* 131 */:
                                    case org.objectweb.asm.Opcodes.IINC /* 132 */:
                                    case org.objectweb.asm.Opcodes.I2L /* 133 */:
                                    case 134:
                                    case 135:
                                    case 136:
                                    case org.objectweb.asm.Opcodes.L2F /* 137 */:
                                    case 138:
                                    case 139:
                                        z = true;
                                        break;
                                }
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            z = true;
                            break;
                    }
                }
                zzd = z;
                zzc = true;
            }
        }
        return zzd;
    }

    protected static final boolean zzaV(com.google.android.gms.internal.ads.zzsg zzsgVar) {
        return com.google.android.gms.internal.ads.zzei.zza >= 35 && zzsgVar.zzh;
    }

    private final android.view.Surface zzaW(com.google.android.gms.internal.ads.zzsg zzsgVar) {
        com.google.android.gms.internal.ads.zzabh zzabhVar = this.zzn;
        if (zzabhVar != null) {
            return zzabhVar.zza();
        }
        android.view.Surface surface = this.zzq;
        if (surface != null) {
            return surface;
        }
        if (zzaV(zzsgVar)) {
            return null;
        }
        com.google.android.gms.internal.ads.zzcw.zzf(zzbc(zzsgVar));
        com.google.android.gms.internal.ads.zzzs zzzsVar = this.zzr;
        if (zzzsVar != null) {
            if (zzzsVar.zza != zzsgVar.zzf) {
                zzba();
            }
        }
        if (this.zzr == null) {
            this.zzr = com.google.android.gms.internal.ads.zzzs.zza(this.zze, zzsgVar.zzf);
        }
        return this.zzr;
    }

    private static java.util.List zzaX(android.content.Context context, com.google.android.gms.internal.ads.zzsp zzspVar, com.google.android.gms.internal.ads.zzab zzabVar, boolean z, boolean z2) throws com.google.android.gms.internal.ads.zzsu {
        if (zzabVar.zzo == null) {
            return com.google.android.gms.internal.ads.zzfxn.zzn();
        }
        if (com.google.android.gms.internal.ads.zzei.zza >= 26 && androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION.equals(zzabVar.zzo) && !com.google.android.gms.internal.ads.zzzn.zza(context)) {
            java.util.List listZzc = com.google.android.gms.internal.ads.zzta.zzc(zzspVar, zzabVar, z, z2);
            if (!listZzc.isEmpty()) {
                return listZzc;
            }
        }
        return com.google.android.gms.internal.ads.zzta.zze(zzspVar, zzabVar, z, z2);
    }

    private final void zzaY() {
        com.google.android.gms.internal.ads.zzcd zzcdVar = this.zzE;
        if (zzcdVar != null) {
            this.zzg.zzt(zzcdVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"displaySurface"})
    public final void zzaZ() {
        this.zzg.zzq(this.zzq);
        this.zzt = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int zzad(com.google.android.gms.internal.ads.zzsg zzsgVar, com.google.android.gms.internal.ads.zzab zzabVar) {
        int iIntValue;
        int i = zzabVar.zzv;
        int i2 = zzabVar.zzw;
        if (i != -1 && i2 != -1) {
            java.lang.String str = zzabVar.zzo;
            str.getClass();
            if (androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION.equals(str)) {
                int i3 = com.google.android.gms.internal.ads.zzta.zza;
                android.util.Pair pairZza = com.google.android.gms.internal.ads.zzcy.zza(zzabVar);
                str = (pairZza == null || !((iIntValue = ((java.lang.Integer) pairZza.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
            }
            int i4 = 4;
            switch (str) {
                case "video/3gpp":
                case "video/mp4v-es":
                case "video/av01":
                case "video/x-vnd.on2.vp8":
                    return ((i * i2) * 3) / i4;
                case "video/hevc":
                    return java.lang.Math.max(2097152, ((i * i2) * 3) / 4);
                case "video/avc":
                    if (!"BRAVIA 4K 2015".equals(com.google.android.gms.internal.ads.zzei.zzd) && (!"Amazon".equals(com.google.android.gms.internal.ads.zzei.zzc) || (!"KFSOWI".equals(com.google.android.gms.internal.ads.zzei.zzd) && (!"AFTS".equals(com.google.android.gms.internal.ads.zzei.zzd) || !zzsgVar.zzf)))) {
                        return ((((i + 15) / 16) * ((i2 + 15) / 16)) * 768) / 4;
                    }
                    break;
                case "video/x-vnd.on2.vp9":
                    i4 = 8;
                    return ((i * i2) * 3) / i4;
            }
        }
        return -1;
    }

    protected static int zzae(com.google.android.gms.internal.ads.zzsg zzsgVar, com.google.android.gms.internal.ads.zzab zzabVar) {
        if (zzabVar.zzp == -1) {
            return zzad(zzsgVar, zzabVar);
        }
        int size = zzabVar.zzr.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += ((byte[]) zzabVar.zzr.get(i)).length;
        }
        return zzabVar.zzp + length;
    }

    private final void zzba() {
        com.google.android.gms.internal.ads.zzzs zzzsVar = this.zzr;
        if (zzzsVar != null) {
            zzzsVar.release();
            this.zzr = null;
        }
    }

    private final boolean zzbb(com.google.android.gms.internal.ads.zzsg zzsgVar) {
        android.view.Surface surface = this.zzq;
        return (surface != null && surface.isValid()) || zzaV(zzsgVar) || zzbc(zzsgVar);
    }

    private final boolean zzbc(com.google.android.gms.internal.ads.zzsg zzsgVar) {
        if (com.google.android.gms.internal.ads.zzei.zza < 23 || zzaU(zzsgVar.zza)) {
            return false;
        }
        return !zzsgVar.zzf || com.google.android.gms.internal.ads.zzzs.zzb(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final void zzA() {
        com.google.android.gms.internal.ads.zzabh zzabhVar = this.zzn;
        if (zzabhVar == null || !this.zzf) {
            return;
        }
        zzabhVar.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzhr
    protected final void zzC() {
        try {
            super.zzC();
        } finally {
            this.zzo = false;
            this.zzI = androidx.media3.common.C.TIME_UNSET;
            zzba();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final void zzD() {
        this.zzx = 0;
        this.zzw = zzi().zzb();
        this.zzA = 0L;
        this.zzB = 0;
        com.google.android.gms.internal.ads.zzabh zzabhVar = this.zzn;
        if (zzabhVar != null) {
            zzabhVar.zzj();
        } else {
            this.zzi.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhr
    protected final void zzE() {
        if (this.zzx > 0) {
            long jZzb = zzi().zzb();
            this.zzg.zzd(this.zzx, jZzb - this.zzw);
            this.zzx = 0;
            this.zzw = jZzb;
        }
        int i = this.zzB;
        if (i != 0) {
            this.zzg.zzr(this.zzA, i);
            this.zzA = 0L;
            this.zzB = 0;
        }
        com.google.android.gms.internal.ads.zzabh zzabhVar = this.zzn;
        if (zzabhVar != null) {
            zzabhVar.zzk();
        } else {
            this.zzi.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzhr
    protected final void zzF(com.google.android.gms.internal.ads.zzab[] zzabVarArr, long j, long j2, com.google.android.gms.internal.ads.zzug zzugVar) throws com.google.android.gms.internal.ads.zzib {
        super.zzF(zzabVarArr, j, j2, zzugVar);
        if (this.zzI == androidx.media3.common.C.TIME_UNSET) {
            this.zzI = j;
        }
        com.google.android.gms.internal.ads.zzbq zzbqVarZzh = zzh();
        if (zzbqVarZzh.zzo()) {
            this.zzJ = androidx.media3.common.C.TIME_UNSET;
        } else {
            this.zzJ = zzbqVarZzh.zzn(zzugVar.zza, new com.google.android.gms.internal.ads.zzbo()).zzd;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzlj
    public final void zzM(float f, float f2) throws com.google.android.gms.internal.ads.zzib {
        super.zzM(f, f2);
        com.google.android.gms.internal.ads.zzabh zzabhVar = this.zzn;
        if (zzabhVar != null) {
            zzabhVar.zzq(f);
        } else {
            this.zzi.zzn(f);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlj, com.google.android.gms.internal.ads.zzlm
    public final java.lang.String zzU() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzlj
    public final void zzV(long j, long j2) throws com.google.android.gms.internal.ads.zzib {
        super.zzV(j, j2);
        com.google.android.gms.internal.ads.zzabh zzabhVar = this.zzn;
        if (zzabhVar != null) {
            try {
                zzabhVar.zzm(j, j2);
            } catch (com.google.android.gms.internal.ads.zzabg e) {
                throw zzcW(e, e.zza, false, 7001);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzlj
    public final boolean zzW() {
        if (!super.zzW()) {
            return false;
        }
        com.google.android.gms.internal.ads.zzabh zzabhVar = this.zzn;
        if (zzabhVar == null) {
            return true;
        }
        zzabhVar.zzv();
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzlj
    public final boolean zzX() {
        boolean zZzX = super.zzX();
        com.google.android.gms.internal.ads.zzabh zzabhVar = this.zzn;
        if (zzabhVar != null) {
            return zzabhVar.zzx(zZzX);
        }
        if (zZzX && (zzaz() == null || this.zzq == null)) {
            return true;
        }
        return this.zzi.zzo(zZzX);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final float zzZ(float f, com.google.android.gms.internal.ads.zzab zzabVar, com.google.android.gms.internal.ads.zzab[] zzabVarArr) {
        float fMax = -1.0f;
        for (com.google.android.gms.internal.ads.zzab zzabVar2 : zzabVarArr) {
            float f2 = zzabVar2.zzx;
            if (f2 != -1.0f) {
                fMax = java.lang.Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final com.google.android.gms.internal.ads.zzsf zzaA(java.lang.Throwable th, com.google.android.gms.internal.ads.zzsg zzsgVar) {
        return new com.google.android.gms.internal.ads.zzzk(th, zzsgVar, this.zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final void zzaD(long j) {
        super.zzaD(j);
        this.zzz--;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final void zzaE(com.google.android.gms.internal.ads.zzhh zzhhVar) throws com.google.android.gms.internal.ads.zzib {
        this.zzz++;
        int i = com.google.android.gms.internal.ads.zzei.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final void zzaF(com.google.android.gms.internal.ads.zzab zzabVar) throws com.google.android.gms.internal.ads.zzib {
        com.google.android.gms.internal.ads.zzabh zzabhVar = this.zzn;
        if (zzabhVar == null || zzabhVar.zzw()) {
            return;
        }
        try {
            zzabhVar.zze(zzabVar);
        } catch (com.google.android.gms.internal.ads.zzabg e) {
            throw zzcW(e, zzabVar, false, 7000);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final void zzaH() {
        super.zzaH();
        this.zzz = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final boolean zzaN(com.google.android.gms.internal.ads.zzsg zzsgVar) {
        return zzbb(zzsgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final boolean zzaO(com.google.android.gms.internal.ads.zzhh zzhhVar) {
        if (zzhhVar.zzi() && !zzQ() && !zzhhVar.zzh() && this.zzJ != androidx.media3.common.C.TIME_UNSET) {
            if (this.zzJ - (zzhhVar.zze - zzav()) > androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US && !zzhhVar.zzl() && zzhhVar.zze < zzf()) {
                return true;
            }
        }
        return false;
    }

    protected final void zzaQ(com.google.android.gms.internal.ads.zzsd zzsdVar, int i, long j) {
        android.os.Trace.beginSection("skipVideoBuffer");
        zzsdVar.zzo(i, false);
        android.os.Trace.endSection();
        this.zza.zzf++;
    }

    protected final void zzaR(int i, int i2) {
        com.google.android.gms.internal.ads.zzhs zzhsVar = this.zza;
        zzhsVar.zzh += i;
        int i3 = i + i2;
        zzhsVar.zzg += i3;
        this.zzx += i3;
        int i4 = this.zzy + i3;
        this.zzy = i4;
        zzhsVar.zzi = java.lang.Math.max(i4, zzhsVar.zzi);
    }

    protected final void zzaS(long j) {
        com.google.android.gms.internal.ads.zzhs zzhsVar = this.zza;
        zzhsVar.zzk += j;
        zzhsVar.zzl++;
        this.zzA += j;
        this.zzB++;
    }

    protected final boolean zzaT(long j, boolean z) throws com.google.android.gms.internal.ads.zzib {
        int iZzd = zzd(j);
        if (iZzd == 0) {
            return false;
        }
        if (z) {
            com.google.android.gms.internal.ads.zzhs zzhsVar = this.zza;
            zzhsVar.zzd += iZzd;
            zzhsVar.zzf += this.zzz;
        } else {
            this.zza.zzj++;
            zzaR(iZzd, this.zzz);
        }
        zzaJ();
        com.google.android.gms.internal.ads.zzabh zzabhVar = this.zzn;
        if (zzabhVar != null) {
            zzabhVar.zzd(false);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final int zzaa(com.google.android.gms.internal.ads.zzsp zzspVar, com.google.android.gms.internal.ads.zzab zzabVar) throws com.google.android.gms.internal.ads.zzsu {
        boolean z;
        if (!com.google.android.gms.internal.ads.zzbb.zzi(zzabVar.zzo)) {
            return 128;
        }
        android.content.Context context = this.zze;
        int i = 0;
        boolean z2 = zzabVar.zzs != null;
        java.util.List listZzaX = zzaX(context, zzspVar, zzabVar, z2, false);
        if (z2 && listZzaX.isEmpty()) {
            listZzaX = zzaX(context, zzspVar, zzabVar, false, false);
        }
        if (listZzaX.isEmpty()) {
            return 129;
        }
        if (!zzaP(zzabVar)) {
            return 130;
        }
        com.google.android.gms.internal.ads.zzsg zzsgVar = (com.google.android.gms.internal.ads.zzsg) listZzaX.get(0);
        boolean zZze = zzsgVar.zze(zzabVar);
        if (!zZze) {
            int i2 = 1;
            while (true) {
                if (i2 >= listZzaX.size()) {
                    z = true;
                    break;
                }
                com.google.android.gms.internal.ads.zzsg zzsgVar2 = (com.google.android.gms.internal.ads.zzsg) listZzaX.get(i2);
                if (zzsgVar2.zze(zzabVar)) {
                    zZze = true;
                    z = false;
                    zzsgVar = zzsgVar2;
                    break;
                }
                i2++;
            }
        } else {
            z = true;
            break;
        }
        int i3 = true != zZze ? 3 : 4;
        int i4 = true != zzsgVar.zzf(zzabVar) ? 8 : 16;
        int i5 = true != zzsgVar.zzg ? 0 : 64;
        int i6 = true != z ? 0 : 128;
        if (com.google.android.gms.internal.ads.zzei.zza >= 26 && androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION.equals(zzabVar.zzo) && !com.google.android.gms.internal.ads.zzzn.zza(context)) {
            i6 = 256;
        }
        if (zZze) {
            java.util.List listZzaX2 = zzaX(context, zzspVar, zzabVar, z2, true);
            if (!listZzaX2.isEmpty()) {
                com.google.android.gms.internal.ads.zzsg zzsgVar3 = (com.google.android.gms.internal.ads.zzsg) com.google.android.gms.internal.ads.zzta.zzf(listZzaX2, zzabVar).get(0);
                if (zzsgVar3.zze(zzabVar) && zzsgVar3.zzf(zzabVar)) {
                    i = 32;
                }
            }
        }
        return i6 | i3 | i4 | i | i5;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final com.google.android.gms.internal.ads.zzht zzab(com.google.android.gms.internal.ads.zzsg zzsgVar, com.google.android.gms.internal.ads.zzab zzabVar, com.google.android.gms.internal.ads.zzab zzabVar2) {
        int i;
        int i2;
        com.google.android.gms.internal.ads.zzht zzhtVarZzb = zzsgVar.zzb(zzabVar, zzabVar2);
        int i3 = zzhtVarZzb.zze;
        com.google.android.gms.internal.ads.zzzo zzzoVar = this.zzk;
        zzzoVar.getClass();
        if (zzabVar2.zzv > zzzoVar.zza || zzabVar2.zzw > zzzoVar.zzb) {
            i3 |= 256;
        }
        if (zzae(zzsgVar, zzabVar2) > zzzoVar.zzc) {
            i3 |= 64;
        }
        java.lang.String str = zzsgVar.zza;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = zzhtVarZzb.zzd;
            i2 = 0;
        }
        return new com.google.android.gms.internal.ads.zzht(str, zzabVar, zzabVar2, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final com.google.android.gms.internal.ads.zzht zzac(com.google.android.gms.internal.ads.zzke zzkeVar) throws com.google.android.gms.internal.ads.zzib {
        com.google.android.gms.internal.ads.zzht zzhtVarZzac = super.zzac(zzkeVar);
        com.google.android.gms.internal.ads.zzab zzabVar = zzkeVar.zza;
        zzabVar.getClass();
        this.zzg.zzf(zzabVar, zzhtVarZzac);
        return zzhtVarZzac;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final com.google.android.gms.internal.ads.zzsa zzaf(com.google.android.gms.internal.ads.zzsg zzsgVar, com.google.android.gms.internal.ads.zzab zzabVar, android.media.MediaCrypto mediaCrypto, float f) {
        android.graphics.Point pointZza;
        int i;
        int i2;
        int iZzad;
        com.google.android.gms.internal.ads.zzab[] zzabVarArrZzT = zzT();
        int length = zzabVarArrZzT.length;
        int iZzae = zzae(zzsgVar, zzabVar);
        int iMax = zzabVar.zzv;
        int iMax2 = zzabVar.zzw;
        if (length != 1) {
            boolean z = false;
            for (int i3 = 0; i3 < length; i3++) {
                com.google.android.gms.internal.ads.zzab zzabVarZzag = zzabVarArrZzT[i3];
                if (zzabVar.zzC != null && zzabVarZzag.zzC == null) {
                    com.google.android.gms.internal.ads.zzz zzzVarZzb = zzabVarZzag.zzb();
                    zzzVarZzb.zzB(zzabVar.zzC);
                    zzabVarZzag = zzzVarZzb.zzag();
                }
                if (zzsgVar.zzb(zzabVar, zzabVarZzag).zzd != 0) {
                    int i4 = zzabVarZzag.zzv;
                    z |= i4 == -1 || zzabVarZzag.zzw == -1;
                    iMax = java.lang.Math.max(iMax, i4);
                    iMax2 = java.lang.Math.max(iMax2, zzabVarZzag.zzw);
                    iZzae = java.lang.Math.max(iZzae, zzae(zzsgVar, zzabVarZzag));
                }
            }
            if (z) {
                com.google.android.gms.internal.ads.zzdo.zzf("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                int i5 = zzabVar.zzw;
                int i6 = zzabVar.zzv;
                boolean z2 = i5 > i6;
                int i7 = z2 ? i5 : i6;
                if (true == z2) {
                    i5 = i6;
                }
                int[] iArr = zzb;
                int i8 = 0;
                while (true) {
                    if (i8 < 9) {
                        float f2 = i5;
                        float f3 = i7;
                        int i9 = iArr[i8];
                        int[] iArr2 = iArr;
                        float f4 = i9;
                        if (i9 > i7 && (i = (int) (f4 * (f2 / f3))) > i5) {
                            int i10 = true != z2 ? i9 : i;
                            if (true != z2) {
                                i9 = i;
                            }
                            pointZza = zzsgVar.zza(i10, i9);
                            float f5 = zzabVar.zzx;
                            if (pointZza != null) {
                                if (zzsgVar.zzg(pointZza.x, pointZza.y, f5)) {
                                    break;
                                }
                            }
                            i8++;
                            z2 = z2;
                            iArr = iArr2;
                            i5 = i5;
                        }
                    }
                    pointZza = null;
                    break;
                }
                if (pointZza != null) {
                    iMax = java.lang.Math.max(iMax, pointZza.x);
                    iMax2 = java.lang.Math.max(iMax2, pointZza.y);
                    com.google.android.gms.internal.ads.zzz zzzVarZzb2 = zzabVar.zzb();
                    zzzVarZzb2.zzaf(iMax);
                    zzzVarZzb2.zzK(iMax2);
                    iZzae = java.lang.Math.max(iZzae, zzad(zzsgVar, zzzVarZzb2.zzag()));
                    com.google.android.gms.internal.ads.zzdo.zzf("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            }
        } else if (iZzae != -1 && (iZzad = zzad(zzsgVar, zzabVar)) != -1) {
            iZzae = java.lang.Math.min((int) (iZzae * 1.5f), iZzad);
        }
        java.lang.String str = zzsgVar.zzc;
        com.google.android.gms.internal.ads.zzzo zzzoVar = new com.google.android.gms.internal.ads.zzzo(iMax, iMax2, iZzae);
        this.zzk = zzzoVar;
        boolean z3 = this.zzh;
        android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", zzabVar.zzv);
        mediaFormat.setInteger("height", zzabVar.zzw);
        com.google.android.gms.internal.ads.zzdr.zzb(mediaFormat, zzabVar.zzr);
        float f6 = zzabVar.zzx;
        if (f6 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f6);
        }
        com.google.android.gms.internal.ads.zzdr.zza(mediaFormat, "rotation-degrees", zzabVar.zzy);
        com.google.android.gms.internal.ads.zzk zzkVar = zzabVar.zzC;
        if (zzkVar != null) {
            com.google.android.gms.internal.ads.zzdr.zza(mediaFormat, "color-transfer", zzkVar.zzd);
            com.google.android.gms.internal.ads.zzdr.zza(mediaFormat, "color-standard", zzkVar.zzb);
            com.google.android.gms.internal.ads.zzdr.zza(mediaFormat, "color-range", zzkVar.zzc);
            byte[] bArr = zzkVar.zze;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", java.nio.ByteBuffer.wrap(bArr));
            }
        }
        if (androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION.equals(zzabVar.zzo)) {
            int i11 = com.google.android.gms.internal.ads.zzta.zza;
            android.util.Pair pairZza = com.google.android.gms.internal.ads.zzcy.zza(zzabVar);
            if (pairZza != null) {
                com.google.android.gms.internal.ads.zzdr.zza(mediaFormat, com.google.android.gms.common.Scopes.PROFILE, ((java.lang.Integer) pairZza.first).intValue());
            }
        }
        mediaFormat.setInteger("max-width", zzzoVar.zza);
        mediaFormat.setInteger("max-height", zzzoVar.zzb);
        com.google.android.gms.internal.ads.zzdr.zza(mediaFormat, "max-input-size", zzzoVar.zzc);
        if (com.google.android.gms.internal.ads.zzei.zza >= 23) {
            mediaFormat.setInteger(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z3) {
            mediaFormat.setInteger("no-post-process", 1);
            i2 = 0;
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            i2 = 0;
        }
        if (com.google.android.gms.internal.ads.zzei.zza >= 35) {
            mediaFormat.setInteger("importance", java.lang.Math.max(i2, -this.zzF));
        }
        android.view.Surface surfaceZzaW = zzaW(zzsgVar);
        if (this.zzn != null && !com.google.android.gms.internal.ads.zzei.zzK(this.zze)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return com.google.android.gms.internal.ads.zzsa.zzb(zzsgVar, mediaFormat, zzabVar, surfaceZzaW, null);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final java.util.List zzag(com.google.android.gms.internal.ads.zzsp zzspVar, com.google.android.gms.internal.ads.zzab zzabVar, boolean z) throws com.google.android.gms.internal.ads.zzsu {
        return com.google.android.gms.internal.ads.zzta.zzf(zzaX(this.zze, zzspVar, zzabVar, false, false), zzabVar);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final void zzaj(com.google.android.gms.internal.ads.zzhh zzhhVar) throws com.google.android.gms.internal.ads.zzib {
        if (this.zzm) {
            java.nio.ByteBuffer byteBuffer = zzhhVar.zzf;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        com.google.android.gms.internal.ads.zzsd zzsdVarZzaz = zzaz();
                        zzsdVarZzaz.getClass();
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        zzsdVarZzaz.zzq(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final void zzak(java.lang.Exception exc) {
        com.google.android.gms.internal.ads.zzdo.zzd("MediaCodecVideoRenderer", "Video codec error", exc);
        this.zzg.zzs(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final void zzal(java.lang.String str, com.google.android.gms.internal.ads.zzsa zzsaVar, long j, long j2) {
        this.zzg.zza(str, j, j2);
        this.zzl = zzaU(str);
        com.google.android.gms.internal.ads.zzsg zzsgVarZzaB = zzaB();
        zzsgVarZzaB.getClass();
        boolean z = false;
        if (com.google.android.gms.internal.ads.zzei.zza >= 29 && androidx.media3.common.MimeTypes.VIDEO_VP9.equals(zzsgVarZzaB.zzb)) {
            for (android.media.MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzsgVarZzaB.zzh()) {
                if (codecProfileLevel.profile == 16384) {
                    z = true;
                    break;
                }
            }
        }
        this.zzm = z;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final void zzam(java.lang.String str) {
        this.zzg.zzb(str);
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final void zzan(com.google.android.gms.internal.ads.zzab zzabVar, android.media.MediaFormat mediaFormat) {
        com.google.android.gms.internal.ads.zzsd zzsdVarZzaz = zzaz();
        if (zzsdVarZzaz != null) {
            zzsdVarZzaz.zzr(this.zzu);
        }
        mediaFormat.getClass();
        boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
        int integer = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer2 = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        float integer3 = zzabVar.zzz;
        if (com.google.android.gms.internal.ads.zzei.zza >= 30 && mediaFormat.containsKey("sar-width") && mediaFormat.containsKey("sar-height")) {
            integer3 = mediaFormat.getInteger("sar-width") / mediaFormat.getInteger("sar-height");
        }
        int i = zzabVar.zzy;
        if (i == 90 || i == 270) {
            integer3 = 1.0f / integer3;
            int i2 = integer2;
            integer2 = integer;
            integer = i2;
        }
        this.zzD = new com.google.android.gms.internal.ads.zzcd(integer, integer2, integer3);
        com.google.android.gms.internal.ads.zzabh zzabhVar = this.zzn;
        if (zzabhVar == null || !this.zzK) {
            this.zzi.zzl(zzabVar.zzx);
        } else {
            com.google.android.gms.internal.ads.zzz zzzVarZzb = zzabVar.zzb();
            zzzVarZzb.zzaf(integer);
            zzzVarZzb.zzK(integer2);
            zzzVarZzb.zzW(integer3);
            zzabhVar.zzg(1, zzzVarZzb.zzag());
        }
        this.zzK = false;
    }

    protected final void zzao(com.google.android.gms.internal.ads.zzsd zzsdVar, int i, long j, long j2) {
        android.os.Trace.beginSection("releaseOutputBuffer");
        zzsdVar.zzn(i, j2);
        android.os.Trace.endSection();
        this.zza.zze++;
        this.zzy = 0;
        if (this.zzn == null) {
            com.google.android.gms.internal.ads.zzcd zzcdVar = this.zzD;
            if (!zzcdVar.equals(com.google.android.gms.internal.ads.zzcd.zza) && !zzcdVar.equals(this.zzE)) {
                this.zzE = zzcdVar;
                this.zzg.zzt(zzcdVar);
            }
            if (!this.zzi.zzp() || this.zzq == null) {
                return;
            }
            zzaZ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final void zzap() {
        com.google.android.gms.internal.ads.zzabh zzabhVar = this.zzn;
        if (zzabhVar != null) {
            zzabhVar.zzr(zzaw(), zzav(), -this.zzI, zzf());
        } else {
            this.zzi.zzf();
        }
        this.zzK = true;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final int zzau(com.google.android.gms.internal.ads.zzhh zzhhVar) {
        int i = com.google.android.gms.internal.ads.zzei.zza;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzlj
    public final void zzt() {
        com.google.android.gms.internal.ads.zzabh zzabhVar = this.zzn;
        if (zzabhVar != null) {
            zzabhVar.zzc();
        } else {
            this.zzi.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzhr
    protected final void zzx() {
        this.zzE = null;
        this.zzJ = androidx.media3.common.C.TIME_UNSET;
        com.google.android.gms.internal.ads.zzabh zzabhVar = this.zzn;
        if (zzabhVar != null) {
            zzabhVar.zzh();
        } else {
            this.zzi.zzd();
        }
        this.zzt = false;
        try {
            super.zzx();
        } finally {
            this.zzg.zzc(this.zza);
            this.zzg.zzt(com.google.android.gms.internal.ads.zzcd.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzhr
    protected final void zzy(boolean z, boolean z2) throws com.google.android.gms.internal.ads.zzib {
        super.zzy(z, z2);
        zzn();
        this.zzg.zze(this.zza);
        if (!this.zzo) {
            if (this.zzp != null && this.zzn == null) {
                com.google.android.gms.internal.ads.zzzw zzzwVar = new com.google.android.gms.internal.ads.zzzw(this.zze, this.zzi);
                zzzwVar.zzd(zzi());
                this.zzn = zzzwVar.zze().zzh();
            }
            this.zzo = true;
        }
        com.google.android.gms.internal.ads.zzabh zzabhVar = this.zzn;
        if (zzabhVar == null) {
            this.zzi.zzk(zzi());
            this.zzi.zze(z2);
            return;
        }
        zzabhVar.zzo(new com.google.android.gms.internal.ads.zzzl(this), com.google.android.gms.internal.ads.zzgcz.zzc());
        com.google.android.gms.internal.ads.zzaai zzaaiVar = this.zzH;
        if (zzaaiVar != null) {
            this.zzn.zzt(zzaaiVar);
        }
        if (this.zzq != null && !this.zzs.equals(com.google.android.gms.internal.ads.zzdz.zza)) {
            this.zzn.zzp(this.zzq, this.zzs);
        }
        this.zzn.zzn(this.zzv);
        this.zzn.zzq(zzat());
        java.util.List list = this.zzp;
        if (list != null) {
            this.zzn.zzs(list);
        }
        this.zzn.zzi(z2);
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzhr
    protected final void zzz(long j, boolean z) throws com.google.android.gms.internal.ads.zzib {
        com.google.android.gms.internal.ads.zzabh zzabhVar = this.zzn;
        if (zzabhVar != null) {
            zzabhVar.zzd(true);
            this.zzn.zzr(zzaw(), zzav(), -this.zzI, zzf());
            this.zzK = true;
        }
        super.zzz(j, z);
        if (this.zzn == null) {
            this.zzi.zzi();
        }
        if (z) {
            com.google.android.gms.internal.ads.zzabh zzabhVar2 = this.zzn;
            if (zzabhVar2 != null) {
                zzabhVar2.zzf(false);
            } else {
                this.zzi.zzc(false);
            }
        }
        this.zzy = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzsn
    protected final boolean zzar(long j, long j2, com.google.android.gms.internal.ads.zzsd zzsdVar, java.nio.ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, com.google.android.gms.internal.ads.zzab zzabVar) throws com.google.android.gms.internal.ads.zzib {
        zzsdVar.getClass();
        long jZzav = j3 - zzav();
        com.google.android.gms.internal.ads.zzabh zzabhVar = this.zzn;
        if (zzabhVar == null) {
            int iZza = this.zzi.zza(j3, j, j2, zzaw(), z2, this.zzj);
            if (iZza == 4) {
                return false;
            }
            if (z && !z2) {
                zzaQ(zzsdVar, i, jZzav);
                return true;
            }
            if (this.zzq == null) {
                if (this.zzj.zzc() >= 30000) {
                    return false;
                }
                zzaQ(zzsdVar, i, jZzav);
                zzaS(this.zzj.zzc());
                return true;
            }
            if (iZza == 0) {
                zzao(zzsdVar, i, jZzav, zzi().zzc());
                zzaS(this.zzj.zzc());
                return true;
            }
            if (iZza == 1) {
                com.google.android.gms.internal.ads.zzaaj zzaajVar = this.zzj;
                long jZzd = zzaajVar.zzd();
                long jZzc = zzaajVar.zzc();
                if (jZzd == this.zzC) {
                    zzaQ(zzsdVar, i, jZzav);
                } else {
                    zzao(zzsdVar, i, jZzav, jZzd);
                }
                zzaS(jZzc);
                this.zzC = jZzd;
                return true;
            }
            if (iZza == 2) {
                android.os.Trace.beginSection("dropVideoBuffer");
                zzsdVar.zzo(i, false);
                android.os.Trace.endSection();
                zzaR(0, 1);
                zzaS(this.zzj.zzc());
                return true;
            }
            if (iZza != 3) {
                if (iZza == 5) {
                    return false;
                }
                throw new java.lang.IllegalStateException(java.lang.String.valueOf(iZza));
            }
            zzaQ(zzsdVar, i, jZzav);
            zzaS(this.zzj.zzc());
            return true;
        }
        try {
            try {
                return zzabhVar.zzu(j3 + (-this.zzI), z2, j, j2, new com.google.android.gms.internal.ads.zzzm(this, zzsdVar, i, jZzav));
            } catch (com.google.android.gms.internal.ads.zzabg e) {
                e = e;
                throw zzcW(e, e.zza, false, 7001);
            }
        } catch (com.google.android.gms.internal.ads.zzabg e2) {
            e = e2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsn, com.google.android.gms.internal.ads.zzhr, com.google.android.gms.internal.ads.zzle
    public final void zzu(int i, java.lang.Object obj) throws com.google.android.gms.internal.ads.zzib {
        if (i == 1) {
            android.view.Surface surface = obj instanceof android.view.Surface ? (android.view.Surface) obj : null;
            if (this.zzq == surface) {
                if (surface != null) {
                    zzaY();
                    android.view.Surface surface2 = this.zzq;
                    if (surface2 == null || !this.zzt) {
                        return;
                    }
                    this.zzg.zzq(surface2);
                    return;
                }
                return;
            }
            this.zzq = surface;
            if (this.zzn == null) {
                this.zzi.zzm(surface);
            }
            this.zzt = false;
            int iZzcT = zzcT();
            com.google.android.gms.internal.ads.zzsd zzsdVarZzaz = zzaz();
            if (zzsdVarZzaz != null && this.zzn == null) {
                com.google.android.gms.internal.ads.zzsg zzsgVarZzaB = zzaB();
                zzsgVarZzaB.getClass();
                boolean zZzbb = zzbb(zzsgVarZzaB);
                if (com.google.android.gms.internal.ads.zzei.zza < 23 || !zZzbb || this.zzl) {
                    zzaG();
                    zzaC();
                } else {
                    android.view.Surface surfaceZzaW = zzaW(zzsgVarZzaB);
                    if (com.google.android.gms.internal.ads.zzei.zza >= 23 && surfaceZzaW != null) {
                        zzsdVarZzaz.zzp(surfaceZzaW);
                    } else {
                        if (com.google.android.gms.internal.ads.zzei.zza < 35) {
                            throw new java.lang.IllegalStateException();
                        }
                        zzsdVarZzaz.zzi();
                    }
                }
            }
            if (surface == null) {
                this.zzE = null;
                com.google.android.gms.internal.ads.zzabh zzabhVar = this.zzn;
                if (zzabhVar != null) {
                    zzabhVar.zzb();
                    return;
                }
                return;
            }
            zzaY();
            if (iZzcT == 2) {
                com.google.android.gms.internal.ads.zzabh zzabhVar2 = this.zzn;
                if (zzabhVar2 != null) {
                    zzabhVar2.zzf(true);
                    return;
                } else {
                    this.zzi.zzc(true);
                    return;
                }
            }
            return;
        }
        if (i == 7) {
            obj.getClass();
            com.google.android.gms.internal.ads.zzaai zzaaiVar = (com.google.android.gms.internal.ads.zzaai) obj;
            this.zzH = zzaaiVar;
            com.google.android.gms.internal.ads.zzabh zzabhVar3 = this.zzn;
            if (zzabhVar3 != null) {
                zzabhVar3.zzt(zzaaiVar);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((java.lang.Integer) obj).intValue();
            if (this.zzG != iIntValue) {
                this.zzG = iIntValue;
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.zzF = ((java.lang.Integer) obj).intValue();
            com.google.android.gms.internal.ads.zzsd zzsdVarZzaz2 = zzaz();
            if (zzsdVarZzaz2 == null || com.google.android.gms.internal.ads.zzei.zza < 35) {
                return;
            }
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("importance", java.lang.Math.max(0, -this.zzF));
            zzsdVarZzaz2.zzq(bundle);
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((java.lang.Integer) obj).intValue();
            this.zzu = iIntValue2;
            com.google.android.gms.internal.ads.zzsd zzsdVarZzaz3 = zzaz();
            if (zzsdVarZzaz3 != null) {
                zzsdVarZzaz3.zzr(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((java.lang.Integer) obj).intValue();
            this.zzv = iIntValue3;
            com.google.android.gms.internal.ads.zzabh zzabhVar4 = this.zzn;
            if (zzabhVar4 != null) {
                zzabhVar4.zzn(iIntValue3);
                return;
            } else {
                this.zzi.zzj(iIntValue3);
                return;
            }
        }
        if (i == 13) {
            obj.getClass();
            java.util.List list = (java.util.List) obj;
            this.zzp = list;
            com.google.android.gms.internal.ads.zzabh zzabhVar5 = this.zzn;
            if (zzabhVar5 != null) {
                zzabhVar5.zzs(list);
                return;
            }
            return;
        }
        if (i != 14) {
            super.zzu(i, obj);
            return;
        }
        obj.getClass();
        com.google.android.gms.internal.ads.zzdz zzdzVar = (com.google.android.gms.internal.ads.zzdz) obj;
        if (zzdzVar.zzb() == 0 || zzdzVar.zza() == 0) {
            return;
        }
        this.zzs = zzdzVar;
        com.google.android.gms.internal.ads.zzabh zzabhVar6 = this.zzn;
        if (zzabhVar6 != null) {
            android.view.Surface surface3 = this.zzq;
            com.google.android.gms.internal.ads.zzcw.zzb(surface3);
            zzabhVar6.zzp(surface3, zzdzVar);
        }
    }
}
