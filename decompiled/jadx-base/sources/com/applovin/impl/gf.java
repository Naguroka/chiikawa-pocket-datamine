package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
abstract class gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final java.lang.String[] f821a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", com.google.common.net.HttpHeaders.TRAILER, "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    public static com.applovin.impl.af.b b(com.applovin.impl.ah ahVar) {
        int iD = ahVar.d() + ahVar.j();
        int iJ = ahVar.j();
        int i = (iJ >> 24) & 255;
        try {
            if (i == 169 || i == 253) {
                int i2 = 16777215 & iJ;
                if (i2 == 6516084) {
                    com.applovin.impl.u3 u3VarA = a(iJ, ahVar);
                    ahVar.f(iD);
                    return u3VarA;
                }
                if (i2 == 7233901 || i2 == 7631467) {
                    com.applovin.impl.zn znVarB = b(iJ, "TIT2", ahVar);
                    ahVar.f(iD);
                    return znVarB;
                }
                if (i2 == 6516589 || i2 == 7828084) {
                    com.applovin.impl.zn znVarB2 = b(iJ, "TCOM", ahVar);
                    ahVar.f(iD);
                    return znVarB2;
                }
                if (i2 == 6578553) {
                    com.applovin.impl.zn znVarB3 = b(iJ, "TDRC", ahVar);
                    ahVar.f(iD);
                    return znVarB3;
                }
                if (i2 == 4280916) {
                    com.applovin.impl.zn znVarB4 = b(iJ, "TPE1", ahVar);
                    ahVar.f(iD);
                    return znVarB4;
                }
                if (i2 == 7630703) {
                    com.applovin.impl.zn znVarB5 = b(iJ, "TSSE", ahVar);
                    ahVar.f(iD);
                    return znVarB5;
                }
                if (i2 == 6384738) {
                    com.applovin.impl.zn znVarB6 = b(iJ, "TALB", ahVar);
                    ahVar.f(iD);
                    return znVarB6;
                }
                if (i2 == 7108978) {
                    com.applovin.impl.zn znVarB7 = b(iJ, "USLT", ahVar);
                    ahVar.f(iD);
                    return znVarB7;
                }
                if (i2 == 6776174) {
                    com.applovin.impl.zn znVarB8 = b(iJ, "TCON", ahVar);
                    ahVar.f(iD);
                    return znVarB8;
                }
                if (i2 == 6779504) {
                    com.applovin.impl.zn znVarB9 = b(iJ, "TIT1", ahVar);
                    ahVar.f(iD);
                    return znVarB9;
                }
            } else {
                if (iJ == 1735291493) {
                    com.applovin.impl.zn znVarC = c(ahVar);
                    ahVar.f(iD);
                    return znVarC;
                }
                if (iJ == 1684632427) {
                    com.applovin.impl.zn znVarA = a(iJ, "TPOS", ahVar);
                    ahVar.f(iD);
                    return znVarA;
                }
                if (iJ == 1953655662) {
                    com.applovin.impl.zn znVarA2 = a(iJ, "TRCK", ahVar);
                    ahVar.f(iD);
                    return znVarA2;
                }
                if (iJ == 1953329263) {
                    com.applovin.impl.xa xaVarA = a(iJ, "TBPM", ahVar, true, false);
                    ahVar.f(iD);
                    return xaVarA;
                }
                if (iJ == 1668311404) {
                    com.applovin.impl.xa xaVarA2 = a(iJ, "TCMP", ahVar, true, true);
                    ahVar.f(iD);
                    return xaVarA2;
                }
                if (iJ == 1668249202) {
                    com.applovin.impl.v0 v0VarA = a(ahVar);
                    ahVar.f(iD);
                    return v0VarA;
                }
                if (iJ == 1631670868) {
                    com.applovin.impl.zn znVarB10 = b(iJ, "TPE2", ahVar);
                    ahVar.f(iD);
                    return znVarB10;
                }
                if (iJ == 1936682605) {
                    com.applovin.impl.zn znVarB11 = b(iJ, "TSOT", ahVar);
                    ahVar.f(iD);
                    return znVarB11;
                }
                if (iJ == 1936679276) {
                    com.applovin.impl.zn znVarB12 = b(iJ, "TSO2", ahVar);
                    ahVar.f(iD);
                    return znVarB12;
                }
                if (iJ == 1936679282) {
                    com.applovin.impl.zn znVarB13 = b(iJ, "TSOA", ahVar);
                    ahVar.f(iD);
                    return znVarB13;
                }
                if (iJ == 1936679265) {
                    com.applovin.impl.zn znVarB14 = b(iJ, "TSOP", ahVar);
                    ahVar.f(iD);
                    return znVarB14;
                }
                if (iJ == 1936679791) {
                    com.applovin.impl.zn znVarB15 = b(iJ, "TSOC", ahVar);
                    ahVar.f(iD);
                    return znVarB15;
                }
                if (iJ == 1920233063) {
                    com.applovin.impl.xa xaVarA3 = a(iJ, "ITUNESADVISORY", ahVar, false, false);
                    ahVar.f(iD);
                    return xaVarA3;
                }
                if (iJ == 1885823344) {
                    com.applovin.impl.xa xaVarA4 = a(iJ, "ITUNESGAPLESS", ahVar, false, true);
                    ahVar.f(iD);
                    return xaVarA4;
                }
                if (iJ == 1936683886) {
                    com.applovin.impl.zn znVarB16 = b(iJ, "TVSHOWSORT", ahVar);
                    ahVar.f(iD);
                    return znVarB16;
                }
                if (iJ == 1953919848) {
                    com.applovin.impl.zn znVarB17 = b(iJ, "TVSHOW", ahVar);
                    ahVar.f(iD);
                    return znVarB17;
                }
                if (iJ == 757935405) {
                    com.applovin.impl.xa xaVarA5 = a(ahVar, iD);
                    ahVar.f(iD);
                    return xaVarA5;
                }
            }
            com.applovin.impl.oc.a("MetadataUtil", "Skipped unknown metadata entry: " + com.applovin.impl.j1.a(iJ));
            ahVar.f(iD);
            return null;
        } catch (java.lang.Throwable th) {
            ahVar.f(iD);
            throw th;
        }
    }

    private static com.applovin.impl.u3 a(int i, com.applovin.impl.ah ahVar) {
        int iJ = ahVar.j();
        if (ahVar.j() == 1684108385) {
            ahVar.g(8);
            java.lang.String strB = ahVar.b(iJ - 16);
            return new com.applovin.impl.u3(androidx.media3.common.C.LANGUAGE_UNDETERMINED, strB, strB);
        }
        com.applovin.impl.oc.d("MetadataUtil", "Failed to parse comment attribute: " + com.applovin.impl.j1.a(i));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0011  */
    private static com.applovin.impl.zn c(com.applovin.impl.ah ahVar) {
        java.lang.String str;
        int iD = d(ahVar);
        if (iD > 0) {
            java.lang.String[] strArr = f821a;
            if (iD <= strArr.length) {
                str = strArr[iD - 1];
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (str != null) {
            return new com.applovin.impl.zn("TCON", null, str);
        }
        com.applovin.impl.oc.d("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    private static int d(com.applovin.impl.ah ahVar) {
        ahVar.g(4);
        if (ahVar.j() == 1684108385) {
            ahVar.g(8);
            return ahVar.w();
        }
        com.applovin.impl.oc.d("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static com.applovin.impl.v0 a(com.applovin.impl.ah ahVar) {
        java.lang.String str;
        int iJ = ahVar.j();
        if (ahVar.j() == 1684108385) {
            int iB = com.applovin.impl.j1.b(ahVar.j());
            if (iB == 13) {
                str = androidx.media3.common.MimeTypes.IMAGE_JPEG;
            } else {
                str = iB == 14 ? androidx.media3.common.MimeTypes.IMAGE_PNG : null;
            }
            if (str == null) {
                com.applovin.impl.oc.d("MetadataUtil", "Unrecognized cover art flags: " + iB);
                return null;
            }
            ahVar.g(4);
            int i = iJ - 16;
            byte[] bArr = new byte[i];
            ahVar.a(bArr, 0, i);
            return new com.applovin.impl.v0(str, null, 3, bArr);
        }
        com.applovin.impl.oc.d("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    private static com.applovin.impl.zn a(int i, java.lang.String str, com.applovin.impl.ah ahVar) {
        int iJ = ahVar.j();
        if (ahVar.j() == 1684108385 && iJ >= 22) {
            ahVar.g(10);
            int iC = ahVar.C();
            if (iC > 0) {
                java.lang.String str2 = "" + iC;
                int iC2 = ahVar.C();
                if (iC2 > 0) {
                    str2 = str2 + "/" + iC2;
                }
                return new com.applovin.impl.zn(str, null, str2);
            }
        }
        com.applovin.impl.oc.d("MetadataUtil", "Failed to parse index/count attribute: " + com.applovin.impl.j1.a(i));
        return null;
    }

    private static com.applovin.impl.zn b(int i, java.lang.String str, com.applovin.impl.ah ahVar) {
        int iJ = ahVar.j();
        if (ahVar.j() == 1684108385) {
            ahVar.g(8);
            return new com.applovin.impl.zn(str, null, ahVar.b(iJ - 16));
        }
        com.applovin.impl.oc.d("MetadataUtil", "Failed to parse text attribute: " + com.applovin.impl.j1.a(i));
        return null;
    }

    private static com.applovin.impl.xa a(com.applovin.impl.ah ahVar, int i) {
        java.lang.String strB = null;
        java.lang.String strB2 = null;
        int i2 = -1;
        int i3 = -1;
        while (ahVar.d() < i) {
            int iD = ahVar.d();
            int iJ = ahVar.j();
            int iJ2 = ahVar.j();
            ahVar.g(4);
            if (iJ2 == 1835360622) {
                strB = ahVar.b(iJ - 12);
            } else if (iJ2 == 1851878757) {
                strB2 = ahVar.b(iJ - 12);
            } else {
                if (iJ2 == 1684108385) {
                    i2 = iD;
                    i3 = iJ;
                }
                ahVar.g(iJ - 12);
            }
        }
        if (strB == null || strB2 == null || i2 == -1) {
            return null;
        }
        ahVar.f(i2);
        ahVar.g(16);
        return new com.applovin.impl.rb(strB, strB2, ahVar.b(i3 - 16));
    }

    public static com.applovin.impl.ed a(com.applovin.impl.ah ahVar, int i, java.lang.String str) {
        while (true) {
            int iD = ahVar.d();
            if (iD >= i) {
                return null;
            }
            int iJ = ahVar.j();
            if (ahVar.j() == 1684108385) {
                int iJ2 = ahVar.j();
                int iJ3 = ahVar.j();
                int i2 = iJ - 16;
                byte[] bArr = new byte[i2];
                ahVar.a(bArr, 0, i2);
                return new com.applovin.impl.ed(str, bArr, iJ3, iJ2);
            }
            ahVar.f(iD + iJ);
        }
    }

    private static com.applovin.impl.xa a(int i, java.lang.String str, com.applovin.impl.ah ahVar, boolean z, boolean z2) {
        int iD = d(ahVar);
        if (z2) {
            iD = java.lang.Math.min(1, iD);
        }
        if (iD < 0) {
            com.applovin.impl.oc.d("MetadataUtil", "Failed to parse uint8 attribute: " + com.applovin.impl.j1.a(i));
            return null;
        }
        if (z) {
            return new com.applovin.impl.zn(str, null, java.lang.Integer.toString(iD));
        }
        return new com.applovin.impl.u3(androidx.media3.common.C.LANGUAGE_UNDETERMINED, str, java.lang.Integer.toString(iD));
    }

    public static void a(int i, com.applovin.impl.y9 y9Var, com.applovin.impl.e9.b bVar) {
        if (i == 1 && y9Var.a()) {
            bVar.e(y9Var.f1535a).f(y9Var.b);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c  */
    public static void a(int i, com.applovin.impl.af afVar, com.applovin.impl.af afVar2, com.applovin.impl.e9.b bVar, com.applovin.impl.af... afVarArr) {
        com.applovin.impl.af afVar3 = new com.applovin.impl.af(new com.applovin.impl.af.b[0]);
        if (i == 1) {
            if (afVar == null) {
                afVar = afVar3;
                break;
            }
        } else {
            if (i != 2 || afVar2 == null) {
                afVar = afVar3;
                break;
            }
            int i2 = 0;
            while (true) {
                if (i2 >= afVar2.c()) {
                    afVar = afVar3;
                    break;
                }
                com.applovin.impl.af.b bVarA = afVar2.a(i2);
                if (bVarA instanceof com.applovin.impl.ed) {
                    com.applovin.impl.ed edVar = (com.applovin.impl.ed) bVarA;
                    if (androidx.media3.container.MdtaMetadataEntry.KEY_ANDROID_CAPTURE_FPS.equals(edVar.f753a)) {
                        afVar = new com.applovin.impl.af(edVar);
                        break;
                    }
                }
                i2++;
            }
        }
        for (com.applovin.impl.af afVar4 : afVarArr) {
            afVar = afVar.a(afVar4);
        }
        if (afVar.c() > 0) {
            bVar.a(afVar);
        }
    }
}
