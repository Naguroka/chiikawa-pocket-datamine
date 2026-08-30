package com.five_corp.ad.internal.layouter;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements com.five_corp.ad.internal.view.r, com.five_corp.ad.internal.layouter.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.five_corp.ad.internal.layouter.a f1941a;
    public final android.content.Context b;
    public final android.os.Handler c;
    public final com.five_corp.ad.internal.logger.a d;
    public final java.util.HashMap e = new java.util.HashMap();
    public final android.view.View f;
    public com.five_corp.ad.internal.ad.custom_layout.d g;
    public final com.five_corp.ad.internal.layouter.d h;
    public int i;
    public int j;
    public final com.five_corp.ad.internal.context.l k;
    public final com.five_corp.ad.internal.viewability.a l;
    public com.five_corp.ad.internal.layouter.i m;

    public e(android.widget.FrameLayout frameLayout, android.content.Context context, com.five_corp.ad.internal.logger.a aVar, android.view.View view, com.five_corp.ad.internal.layouter.d dVar, com.five_corp.ad.internal.context.l lVar, java.lang.String str, com.five_corp.ad.internal.viewability.a aVar2, com.five_corp.ad.internal.ad.custom_layout.d dVar2, com.five_corp.ad.internal.layouter.k kVar) {
        com.five_corp.ad.internal.layouter.a aVar3 = new com.five_corp.ad.internal.layouter.a(this, context);
        this.f1941a = aVar3;
        this.b = context;
        this.c = new android.os.Handler(android.os.Looper.getMainLooper());
        this.d = aVar;
        this.f = view;
        this.h = dVar;
        this.k = lVar;
        this.l = aVar2;
        this.g = dVar2;
        this.m = kVar.a(this);
        frameLayout.addView(aVar3);
        android.graphics.drawable.BitmapDrawable bitmapDrawableA = com.five_corp.ad.internal.layouter.m.a(str, context.getResources(), aVar);
        if (bitmapDrawableA != null) {
            android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(context);
            frameLayout2.setClickable(false);
            frameLayout2.setFocusable(false);
            frameLayout2.setBackground(bitmapDrawableA);
            frameLayout.addView(frameLayout2);
        }
    }

    public final void a(com.five_corp.ad.internal.ad.custom_layout.d dVar) {
        this.f1941a.isInLayout();
        this.g = dVar;
        java.util.Iterator it = this.e.entrySet().iterator();
        while (it.hasNext()) {
            com.five_corp.ad.internal.view.M.a((android.view.View) ((java.util.Map.Entry) it.next()).getValue());
        }
        this.e.clear();
    }

    public final /* synthetic */ void b(float f, float f2) {
        com.five_corp.ad.internal.ad.custom_layout.a aVarA = a(f, f2);
        if (aVarA != null) {
            switch (com.five_corp.ad.e.a(aVarA.f1798a)) {
                case 1:
                    this.h.c();
                    break;
                case 2:
                    this.h.a();
                    break;
                case 3:
                    this.h.g();
                    break;
                case 4:
                    this.h.d();
                    break;
                case 5:
                    this.h.f();
                    break;
                case 6:
                    this.h.b();
                    break;
                case 7:
                    java.lang.String str = aVarA.h;
                    if (str != null) {
                        this.h.a(str);
                    }
                    break;
                case 8:
                    this.h.e();
                    break;
            }
        }
    }

    public final com.five_corp.ad.internal.ad.custom_layout.a a(float f, float f2) {
        double width = ((double) this.f1941a.getWidth()) / ((double) this.g.f1800a);
        double height = this.f1941a.getHeight();
        com.five_corp.ad.internal.ad.custom_layout.d dVar = this.g;
        double d = height / ((double) dVar.b);
        com.five_corp.ad.internal.ad.custom_layout.a aVar = null;
        for (com.five_corp.ad.internal.ad.custom_layout.a aVar2 : dVar.d) {
            if (a(this.m, aVar2.g)) {
                int i = aVar2.b;
                double d2 = f;
                if (((double) i) * width <= d2 && d2 <= ((double) (i + aVar2.e)) * width) {
                    int i2 = aVar2.c;
                    double d3 = f2;
                    if (((double) i2) * d <= d3 && d3 <= ((double) (i2 + aVar2.f)) * d && (aVar == null || aVar.d < aVar2.d)) {
                        aVar = aVar2;
                    }
                }
            }
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0061  */
    /* JADX WARN: Code duplicated, block: B:44:0x0069 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x006e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0072  */
    /* JADX WARN: Code duplicated, block: B:50:0x0076  */
    /* JADX WARN: Code duplicated, block: B:52:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0080 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x0083  */
    /* JADX WARN: Code duplicated, block: B:56:0x0087  */
    /* JADX WARN: Code duplicated, block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    public static boolean a(com.five_corp.ad.internal.layouter.i iVar, com.five_corp.ad.internal.ad.custom_layout.c cVar) {
        int iA;
        int iA2;
        boolean z;
        boolean z2;
        boolean z3;
        java.lang.Integer num;
        if (cVar == null) {
            return true;
        }
        com.five_corp.ad.internal.ad.custom_layout.n nVar = cVar.f1799a;
        int iA3 = com.five_corp.ad.e.a(nVar.f1808a);
        if (iA3 == 0) {
            iA = com.five_corp.ad.e.a(cVar.b);
            if (iA == 0) {
                iA2 = com.five_corp.ad.e.a(cVar.c);
                if (iA2 != 0) {
                    return true;
                }
                if (iA2 != 1) {
                    z = iVar.g;
                } else if (iA2 == 2) {
                    z = !iVar.g;
                }
                if (z) {
                    return true;
                }
            } else {
                if (iA == 1) {
                    z2 = iVar.f;
                } else if (iA == 2) {
                    z2 = !iVar.f;
                }
                if (z2) {
                    iA2 = com.five_corp.ad.e.a(cVar.c);
                    if (iA2 != 0) {
                        return true;
                    }
                    if (iA2 != 1) {
                        z = iVar.g;
                    } else if (iA2 == 2) {
                        z = !iVar.g;
                    }
                    if (z) {
                        return true;
                    }
                }
            }
        } else {
            if (iA3 == 1) {
                z3 = iVar.e;
            } else if (iA3 == 2) {
                z3 = !iVar.e;
            } else if (iA3 == 3) {
                java.lang.Integer num2 = nVar.b;
                if (num2 != null) {
                    if (nVar.c != null) {
                        int iIntValue = num2.intValue();
                        int i = iVar.f1944a;
                        if (iIntValue <= i && i < nVar.c.intValue() && !iVar.e) {
                            iA = com.five_corp.ad.e.a(cVar.b);
                            if (iA == 0) {
                                iA2 = com.five_corp.ad.e.a(cVar.c);
                                if (iA2 != 0) {
                                    return true;
                                }
                                if (iA2 != 1) {
                                    z = iVar.g;
                                } else if (iA2 == 2) {
                                    z = !iVar.g;
                                }
                                if (z) {
                                    return true;
                                }
                            } else {
                                if (iA == 1) {
                                    z2 = iVar.f;
                                } else if (iA == 2) {
                                    z2 = !iVar.f;
                                }
                                if (z2) {
                                    iA2 = com.five_corp.ad.e.a(cVar.c);
                                    if (iA2 != 0) {
                                        return true;
                                    }
                                    if (iA2 != 1) {
                                        z = iVar.g;
                                    } else if (iA2 == 2) {
                                        z = !iVar.g;
                                    }
                                    if (z) {
                                        return true;
                                    }
                                }
                            }
                        }
                    } else if (num2.intValue() <= iVar.f1944a || iVar.e) {
                        iA = com.five_corp.ad.e.a(cVar.b);
                        if (iA == 0) {
                            iA2 = com.five_corp.ad.e.a(cVar.c);
                            if (iA2 != 0) {
                                return true;
                            }
                            if (iA2 != 1) {
                                z = iVar.g;
                            } else if (iA2 == 2) {
                                z = !iVar.g;
                            }
                            if (z) {
                                return true;
                            }
                        } else {
                            if (iA == 1) {
                                z2 = iVar.f;
                            } else if (iA == 2) {
                                z2 = !iVar.f;
                            }
                            if (z2) {
                                iA2 = com.five_corp.ad.e.a(cVar.c);
                                if (iA2 != 0) {
                                    return true;
                                }
                                if (iA2 != 1) {
                                    z = iVar.g;
                                } else if (iA2 == 2) {
                                    z = !iVar.g;
                                }
                                if (z) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            } else if (iA3 == 4 && (num = nVar.b) != null && num.intValue() <= iVar.f1944a && !iVar.e) {
                iA = com.five_corp.ad.e.a(cVar.b);
                if (iA == 0) {
                    iA2 = com.five_corp.ad.e.a(cVar.c);
                    if (iA2 != 0) {
                        return true;
                    }
                    if (iA2 != 1) {
                        z = iVar.g;
                    } else if (iA2 == 2) {
                        z = !iVar.g;
                    }
                    if (z) {
                        return true;
                    }
                } else {
                    if (iA == 1) {
                        z2 = iVar.f;
                    } else if (iA == 2) {
                        z2 = !iVar.f;
                    }
                    if (z2) {
                        iA2 = com.five_corp.ad.e.a(cVar.c);
                        if (iA2 != 0) {
                            return true;
                        }
                        if (iA2 != 1) {
                            z = iVar.g;
                        } else if (iA2 == 2) {
                            z = !iVar.g;
                        }
                        if (z) {
                            return true;
                        }
                    }
                }
            }
            if (z3) {
                iA = com.five_corp.ad.e.a(cVar.b);
                if (iA == 0) {
                    iA2 = com.five_corp.ad.e.a(cVar.c);
                    if (iA2 != 0) {
                        return true;
                    }
                    if (iA2 != 1) {
                        z = iVar.g;
                    } else if (iA2 == 2) {
                        z = !iVar.g;
                    }
                    if (z) {
                        return true;
                    }
                } else {
                    if (iA == 1) {
                        z2 = iVar.f;
                    } else if (iA == 2) {
                        z2 = !iVar.f;
                    }
                    if (z2) {
                        iA2 = com.five_corp.ad.e.a(cVar.c);
                        if (iA2 != 0) {
                            return true;
                        }
                        if (iA2 != 1) {
                            z = iVar.g;
                        } else if (iA2 == 2) {
                            z = !iVar.g;
                        }
                        if (z) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.five_corp.ad.internal.layouter.j
    public final void a(com.five_corp.ad.internal.layouter.i iVar) {
        this.m = iVar;
        for (java.util.Map.Entry entry : this.e.entrySet()) {
            if (entry.getValue() instanceof com.five_corp.ad.internal.layouter.l) {
                ((com.five_corp.ad.internal.layouter.l) entry.getValue()).a(this.m);
            }
        }
        a(this.f1941a.getWidth(), this.f1941a.getHeight());
    }

    public final void a() {
        this.f1941a.getParent();
        this.f1941a.setClickable(true);
        this.f1941a.setOnTouchListener(new com.five_corp.ad.internal.view.ViewOnTouchListenerC1514g(this.b, new com.five_corp.ad.internal.view.InterfaceC1513f() { // from class: com.five_corp.ad.internal.layouter.e$$ExternalSyntheticLambda0
            @Override // com.five_corp.ad.internal.view.InterfaceC1513f
            public final void a(float f, float f2) {
                this.f$0.b(f, f2);
            }
        }, this.d));
        this.f1941a.setBackgroundColor(0);
        if (this.f.getParent() != this.f1941a) {
            com.five_corp.ad.internal.view.M.a(this.f);
            this.f1941a.addView(this.f);
            a(this.f1941a.getWidth(), this.f1941a.getHeight());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:111:0x0271  */
    /* JADX WARN: Code duplicated, block: B:128:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:136:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:142:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:144:0x0307  */
    /* JADX WARN: Code duplicated, block: B:88:0x0205 A[DONT_INVERT, PHI: r8
  0x0205: PHI (r8v4 ??) = 
  (r8v2 ??)
  (r8v2 ??)
  (r8v9 ??)
  (r8v2 ??)
  (r8v2 ??)
  (r8v2 ??)
  (r8v14 ??)
  (r8v2 ??)
  (r8v17 ??)
  (r8v18 ??)
  (r8v2 ??)
  (r8v20 ??)
  (r8v2 ??)
  (r8v2 ??)
  (r8v22 ??)
  (r8v2 ??)
  (r8v24 ??)
 binds: [B:15:0x0051, B:63:0x0183, B:87:0x01fe, B:58:0x0169, B:55:0x0160, B:51:0x0135, B:53:0x0139, B:44:0x0110, B:49:0x0120, B:48:0x011c, B:40:0x00f7, B:61:0x017c, B:36:0x00d6, B:22:0x006e, B:152:0x0205, B:18:0x005c, B:20:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:89:0x0207  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r4v17, types: [android.view.ViewGroup, com.five_corp.ad.internal.layouter.a] */
    /* JADX WARN: Type inference failed for: r4v18, types: [android.view.ViewGroup, com.five_corp.ad.internal.layouter.a] */
    /* JADX WARN: Type inference failed for: r4v39, types: [com.five_corp.ad.internal.viewability.a] */
    /* JADX WARN: Type inference failed for: r7v8, types: [android.view.ViewGroup, com.five_corp.ad.internal.layouter.a] */
    /* JADX WARN: Type inference failed for: r8v14, types: [android.view.View, android.webkit.WebView] */
    /* JADX WARN: Type inference failed for: r8v17, types: [android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v22, types: [android.widget.HorizontalScrollView] */
    /* JADX WARN: Type inference failed for: r8v24, types: [com.five_corp.ad.internal.cache.b] */
    /* JADX WARN: Type inference failed for: r8v3, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r8v4, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void a(int i, int i2) {
        int i3;
        android.widget.FrameLayout.LayoutParams layoutParams;
        int i4;
        int i5;
        int i6;
        android.view.View c1518k;
        if (i == 0 || i2 == 0) {
            return;
        }
        com.five_corp.ad.internal.ad.custom_layout.d dVar = this.g;
        java.util.Collections.sort(dVar.c, new com.five_corp.ad.internal.layouter.b());
        int i7 = 0;
        boolean z = false;
        int i8 = 0;
        for (com.five_corp.ad.internal.ad.custom_layout.h hVar : dVar.c) {
            ?? webView = (android.view.View) this.e.get(hVar);
            if (a(this.m, hVar.g)) {
                if (webView == 0) {
                    switch (com.five_corp.ad.e.a(hVar.f1804a.f1801a)) {
                        case 0:
                            com.five_corp.ad.internal.ad.custom_layout.k kVar = hVar.f1804a.b;
                            if (kVar != null) {
                                java.lang.String strReplace = kVar.f1807a.replace("<br>", "\n");
                                int iA = com.five_corp.ad.e.a(kVar.d);
                                if (iA == 0) {
                                    i6 = 17;
                                } else if (iA == 1) {
                                    i6 = androidx.core.view.GravityCompat.START;
                                } else {
                                    if (iA != 2) {
                                        throw new java.lang.RuntimeException("Unsupported gravity ".concat(com.five_corp.ad.internal.ad.custom_layout.m.b(kVar.d)));
                                    }
                                    i6 = androidx.core.view.GravityCompat.END;
                                }
                                android.content.Context context = this.b;
                                java.lang.String str = kVar.b;
                                java.lang.String str2 = kVar.c;
                                boolean z2 = kVar.e;
                                boolean z3 = kVar.f;
                                boolean z4 = kVar.h == null;
                                android.widget.TextView textView = new android.widget.TextView(context);
                                textView.setText(strReplace);
                                textView.setTextColor(com.five_corp.ad.internal.view.M.a(str));
                                if (z3) {
                                    textView.setTypeface(android.graphics.Typeface.DEFAULT_BOLD);
                                }
                                android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
                                gradientDrawable.setColor(com.five_corp.ad.internal.view.M.a(str2));
                                if (z4) {
                                    gradientDrawable.setCornerRadius(5.0f);
                                }
                                if (z2) {
                                    gradientDrawable.setStroke(1, com.five_corp.ad.internal.view.M.a(str));
                                }
                                com.five_corp.ad.internal.view.M.a(textView, gradientDrawable);
                                textView.setGravity(i6);
                                webView = textView;
                            }
                            if (webView != 0 && hVar.f1804a.f1801a != 3) {
                                this.e.put(hVar, webView);
                                this.l.a(webView, hVar.h);
                            }
                            break;
                        case 1:
                            com.five_corp.ad.internal.ad.w wVar = hVar.f1804a.c;
                            if (wVar != null) {
                                com.five_corp.ad.internal.cache.b bVarA = this.k.h.a(this.b, wVar);
                                bVarA.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
                                c1518k = bVarA;
                                webView = c1518k;
                                if (webView != 0) {
                                    this.e.put(hVar, webView);
                                    this.l.a(webView, hVar.h);
                                }
                            } else if (webView != 0) {
                                this.e.put(hVar, webView);
                                this.l.a(webView, hVar.h);
                            }
                            break;
                        case 2:
                            if (this.f.getParent() == this.f1941a) {
                                c1518k = this.f;
                                webView = c1518k;
                                if (webView != 0) {
                                    this.e.put(hVar, webView);
                                    this.l.a(webView, hVar.h);
                                }
                            } else if (webView != 0) {
                                this.e.put(hVar, webView);
                                this.l.a(webView, hVar.h);
                            }
                            break;
                        case 3:
                            com.five_corp.ad.internal.ad.format_config.b bVar = hVar.f1804a.d;
                            if (bVar != null) {
                                webView = new android.webkit.WebView(this.b);
                                com.five_corp.ad.internal.view.s.a(webView, this.k.g, bVar, this, this.d);
                                webView.setVerticalScrollBarEnabled(false);
                                webView.setHorizontalScrollBarEnabled(false);
                                webView.setBackgroundColor(0);
                                webView.setVisibility(0);
                            }
                            if (webView != 0) {
                                this.e.put(hVar, webView);
                                this.l.a(webView, hVar.h);
                            }
                            break;
                        case 4:
                            com.five_corp.ad.internal.ad.custom_layout.f fVar = hVar.f1804a.e;
                            if (fVar != null) {
                                if (fVar.b.size() == 0) {
                                    webView = 0;
                                } else {
                                    webView = new android.widget.FrameLayout(this.b);
                                    new com.five_corp.ad.internal.layouter.c(this, fVar, webView).run();
                                }
                            }
                            if (webView != 0) {
                                this.e.put(hVar, webView);
                                this.l.a(webView, hVar.h);
                            }
                            break;
                        case 5:
                            if (hVar.f1804a.f != null) {
                                c1518k = new com.five_corp.ad.internal.view.C1518k(this.b, this.k.h, hVar.f1804a.f);
                                webView = c1518k;
                                if (webView != 0) {
                                    this.e.put(hVar, webView);
                                    this.l.a(webView, hVar.h);
                                }
                            } else if (webView != 0) {
                                this.e.put(hVar, webView);
                                this.l.a(webView, hVar.h);
                            }
                            break;
                        case 6:
                            if (hVar.f1804a.g != null) {
                                c1518k = new com.five_corp.ad.internal.view.C1516i(this.b, hVar.f1804a.g, this.k.b.g.intValue(), this.d);
                                webView = c1518k;
                                if (webView != 0) {
                                    this.e.put(hVar, webView);
                                    this.l.a(webView, hVar.h);
                                }
                            } else if (webView != 0) {
                                this.e.put(hVar, webView);
                                this.l.a(webView, hVar.h);
                            }
                            break;
                        case 7:
                            com.five_corp.ad.internal.ad.custom_layout.g gVar = hVar.f1804a.h;
                            if (gVar != null) {
                                webView = new android.widget.HorizontalScrollView(this.b);
                                java.lang.String str3 = gVar.b;
                                if (str3 != null) {
                                    webView.setBackgroundColor(com.five_corp.ad.internal.view.M.a(str3));
                                }
                                android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this.b);
                                linearLayout.setOrientation(i7);
                                webView.addView(linearLayout, new android.view.ViewGroup.LayoutParams(-2, -1));
                                java.util.Iterator it = gVar.f1803a.iterator();
                                boolean z5 = true;
                                while (it.hasNext()) {
                                    com.five_corp.ad.internal.cache.b bVarA2 = this.k.h.a(this.b, (com.five_corp.ad.internal.ad.w) it.next());
                                    bVarA2.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                                    bVarA2.setAdjustViewBounds(true);
                                    android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -1);
                                    if (z5) {
                                        z5 = false;
                                    } else {
                                        layoutParams2.leftMargin = 16;
                                    }
                                    linearLayout.addView(bVarA2, layoutParams2);
                                }
                            }
                            if (webView != 0) {
                                this.e.put(hVar, webView);
                                this.l.a(webView, hVar.h);
                            }
                            break;
                        case 8:
                            com.five_corp.ad.internal.context.l lVar = this.k;
                            com.five_corp.ad.internal.ad.w wVar2 = lVar.b.r;
                            if (wVar2 != null) {
                                webView = lVar.h.a(this.b, wVar2);
                            }
                            if (webView != 0) {
                                this.e.put(hVar, webView);
                                this.l.a(webView, hVar.h);
                            }
                            break;
                        default:
                            if (webView != 0) {
                                this.e.put(hVar, webView);
                                this.l.a(webView, hVar.h);
                            }
                            break;
                    }
                }
                if (webView != 0) {
                    int i9 = (hVar.e * i) / dVar.f1800a;
                    com.five_corp.ad.internal.ad.custom_layout.e eVar = hVar.f1804a;
                    boolean z6 = true;
                    if (eVar.f1801a == 1) {
                        android.widget.TextView textView2 = (android.widget.TextView) webView;
                        com.five_corp.ad.internal.ad.custom_layout.k kVar2 = eVar.b;
                        if (kVar2 == null) {
                            i3 = 0;
                        } else {
                            java.lang.Integer num = kVar2.h;
                            java.lang.Float fValueOf = num != null ? java.lang.Float.valueOf((num.intValue() * i) / dVar.f1800a) : null;
                            if (fValueOf != null) {
                                textView2.setPadding(fValueOf.intValue(), 0, fValueOf.intValue(), 0);
                                int iA2 = com.five_corp.ad.e.a(kVar2.d);
                                z6 = true;
                                if (iA2 == 0) {
                                    i5 = 17;
                                } else if (iA2 == 1) {
                                    i5 = androidx.core.view.GravityCompat.START;
                                } else if (iA2 != 2) {
                                    i5 = 17;
                                } else {
                                    i5 = androidx.core.view.GravityCompat.END;
                                }
                                textView2.setGravity(i5 | 16);
                                i4 = -2;
                            } else {
                                z6 = true;
                                i4 = i9;
                            }
                            java.lang.Integer num2 = kVar2.g;
                            java.lang.Float fValueOf2 = num2 != null ? java.lang.Float.valueOf((num2.intValue() * i) / dVar.f1800a) : null;
                            if (fValueOf2 != null) {
                                i3 = 0;
                                textView2.setTextSize(0, fValueOf2.floatValue());
                            } else {
                                i3 = 0;
                            }
                            i9 = i4;
                        }
                    } else {
                        i3 = 0;
                    }
                    android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(i9, (hVar.f * i2) / dVar.b);
                    layoutParams3.leftMargin = (hVar.b * i) / dVar.f1800a;
                    layoutParams3.topMargin = (hVar.c * i2) / dVar.b;
                    if (hVar.f1804a.f1801a != 3) {
                        android.view.ViewParent parent = webView.getParent();
                        ?? r7 = this.f1941a;
                        if (parent == r7) {
                            layoutParams = (android.widget.FrameLayout.LayoutParams) webView.getLayoutParams();
                            if (layoutParams3.width == layoutParams.width || layoutParams3.height != layoutParams.height || layoutParams3.leftMargin != layoutParams.leftMargin || layoutParams3.topMargin != layoutParams.topMargin) {
                                webView.setLayoutParams(layoutParams3);
                            }
                            if (!z && this.f1941a.indexOfChild(webView) != i8) {
                                z = z6;
                            }
                            if (z) {
                                this.f1941a.bringChildToFront(webView);
                            }
                        } else {
                            r7.addView(webView, layoutParams3);
                        }
                    } else {
                        layoutParams = (android.widget.FrameLayout.LayoutParams) webView.getLayoutParams();
                        if (layoutParams3.width == layoutParams.width) {
                            webView.setLayoutParams(layoutParams3);
                        } else {
                            webView.setLayoutParams(layoutParams3);
                        }
                        if (!z) {
                            z = z6;
                        }
                        if (z) {
                            this.f1941a.bringChildToFront(webView);
                        }
                    }
                    i8++;
                } else {
                    i3 = 0;
                }
            } else {
                com.five_corp.ad.internal.view.M.a((android.view.View) webView);
                i3 = i7;
            }
            i7 = i3;
        }
    }
}
