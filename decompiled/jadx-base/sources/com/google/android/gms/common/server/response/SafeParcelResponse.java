package com.google.android.gms.common.server.response;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class SafeParcelResponse extends com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.server.response.SafeParcelResponse> CREATOR = new com.google.android.gms.common.server.response.zaq();
    private final int zaa;
    private final android.os.Parcel zab;
    private final int zac;
    private final com.google.android.gms.common.server.response.zan zad;
    private final java.lang.String zae;
    private int zaf;
    private int zag;

    SafeParcelResponse(int i, android.os.Parcel parcel, com.google.android.gms.common.server.response.zan zanVar) {
        this.zaa = i;
        this.zab = (android.os.Parcel) com.google.android.gms.common.internal.Preconditions.checkNotNull(parcel);
        this.zac = 2;
        this.zad = zanVar;
        this.zae = zanVar == null ? null : zanVar.zaa();
        this.zaf = 2;
    }

    public static <T extends com.google.android.gms.common.server.response.FastJsonResponse & com.google.android.gms.common.internal.safeparcel.SafeParcelable> com.google.android.gms.common.server.response.SafeParcelResponse from(T t) {
        java.lang.String str = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(t.getClass().getCanonicalName());
        com.google.android.gms.common.server.response.zan zanVar = new com.google.android.gms.common.server.response.zan(t.getClass());
        zaF(zanVar, t);
        zanVar.zac();
        zanVar.zad();
        return new com.google.android.gms.common.server.response.SafeParcelResponse(t, zanVar, str);
    }

    private static void zaF(com.google.android.gms.common.server.response.zan zanVar, com.google.android.gms.common.server.response.FastJsonResponse fastJsonResponse) {
        java.lang.Class<?> cls = fastJsonResponse.getClass();
        if (zanVar.zaf(cls)) {
            return;
        }
        java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        zanVar.zae(cls, fieldMappings);
        java.util.Iterator<java.lang.String> it = fieldMappings.keySet().iterator();
        while (it.hasNext()) {
            com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field = fieldMappings.get(it.next());
            java.lang.Class cls2 = field.zag;
            if (cls2 != null) {
                try {
                    zaF(zanVar, (com.google.android.gms.common.server.response.FastJsonResponse) cls2.newInstance());
                } catch (java.lang.IllegalAccessException e) {
                    throw new java.lang.IllegalStateException("Could not access object of type ".concat(java.lang.String.valueOf(((java.lang.Class) com.google.android.gms.common.internal.Preconditions.checkNotNull(field.zag)).getCanonicalName())), e);
                } catch (java.lang.InstantiationException e2) {
                    throw new java.lang.IllegalStateException("Could not instantiate an object of type ".concat(java.lang.String.valueOf(((java.lang.Class) com.google.android.gms.common.internal.Preconditions.checkNotNull(field.zag)).getCanonicalName())), e2);
                }
            }
        }
    }

    private final void zaH(java.lang.StringBuilder sb, java.util.Map map, android.os.Parcel parcel) {
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        for (java.util.Map.Entry entry : map.entrySet()) {
            sparseArray.put(((com.google.android.gms.common.server.response.FastJsonResponse.Field) entry.getValue()).getSafeParcelableFieldId(), entry);
        }
        sb.append('{');
        int iValidateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        boolean z = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            java.util.Map.Entry entry2 = (java.util.Map.Entry) sparseArray.get(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(header));
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                java.lang.String str = (java.lang.String) entry2.getKey();
                com.google.android.gms.common.server.response.FastJsonResponse.Field field = (com.google.android.gms.common.server.response.FastJsonResponse.Field) entry2.getValue();
                sb.append("\"");
                sb.append(str);
                sb.append("\":");
                if (field.zaj()) {
                    int i = field.zac;
                    switch (i) {
                        case 0:
                            zaJ(sb, field, zaD(field, java.lang.Integer.valueOf(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header))));
                            break;
                        case 1:
                            zaJ(sb, field, zaD(field, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigInteger(parcel, header)));
                            break;
                        case 2:
                            zaJ(sb, field, zaD(field, java.lang.Long.valueOf(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header))));
                            break;
                        case 3:
                            zaJ(sb, field, zaD(field, java.lang.Float.valueOf(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, header))));
                            break;
                        case 4:
                            zaJ(sb, field, zaD(field, java.lang.Double.valueOf(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(parcel, header))));
                            break;
                        case 5:
                            zaJ(sb, field, zaD(field, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigDecimal(parcel, header)));
                            break;
                        case 6:
                            zaJ(sb, field, zaD(field, java.lang.Boolean.valueOf(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header))));
                            break;
                        case 7:
                            zaJ(sb, field, zaD(field, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header)));
                            break;
                        case 8:
                        case 9:
                            zaJ(sb, field, zaD(field, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, header)));
                            break;
                        case 10:
                            android.os.Bundle bundleCreateBundle = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, header);
                            java.util.HashMap map2 = new java.util.HashMap();
                            for (java.lang.String str2 : bundleCreateBundle.keySet()) {
                                map2.put(str2, (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(bundleCreateBundle.getString(str2)));
                            }
                            zaJ(sb, field, zaD(field, map2));
                            break;
                        case 11:
                            throw new java.lang.IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new java.lang.IllegalArgumentException("Unknown field out type = " + i);
                    }
                } else if (field.zad) {
                    sb.append(com.ironsource.y8.i.d);
                    switch (field.zac) {
                        case 0:
                            com.google.android.gms.common.util.ArrayUtils.writeArray(sb, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createIntArray(parcel, header));
                            break;
                        case 1:
                            com.google.android.gms.common.util.ArrayUtils.writeArray(sb, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigIntegerArray(parcel, header));
                            break;
                        case 2:
                            com.google.android.gms.common.util.ArrayUtils.writeArray(sb, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createLongArray(parcel, header));
                            break;
                        case 3:
                            com.google.android.gms.common.util.ArrayUtils.writeArray(sb, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createFloatArray(parcel, header));
                            break;
                        case 4:
                            com.google.android.gms.common.util.ArrayUtils.writeArray(sb, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createDoubleArray(parcel, header));
                            break;
                        case 5:
                            com.google.android.gms.common.util.ArrayUtils.writeArray(sb, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigDecimalArray(parcel, header));
                            break;
                        case 6:
                            com.google.android.gms.common.util.ArrayUtils.writeArray(sb, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBooleanArray(parcel, header));
                            break;
                        case 7:
                            com.google.android.gms.common.util.ArrayUtils.writeStringArray(sb, com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringArray(parcel, header));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new java.lang.UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            android.os.Parcel[] parcelArrCreateParcelArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelArray(parcel, header);
                            int length = parcelArrCreateParcelArray.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 > 0) {
                                    sb.append(",");
                                }
                                parcelArrCreateParcelArray[i2].setDataPosition(0);
                                zaH(sb, field.zah(), parcelArrCreateParcelArray[i2]);
                            }
                            break;
                        default:
                            throw new java.lang.IllegalStateException("Unknown field type out.");
                    }
                    sb.append(com.ironsource.y8.i.e);
                } else {
                    switch (field.zac) {
                        case 0:
                            sb.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(parcel, header));
                            break;
                        case 1:
                            sb.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigInteger(parcel, header));
                            break;
                        case 2:
                            sb.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(parcel, header));
                            break;
                        case 3:
                            sb.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(parcel, header));
                            break;
                        case 4:
                            sb.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readDouble(parcel, header));
                            break;
                        case 5:
                            sb.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBigDecimal(parcel, header));
                            break;
                        case 6:
                            sb.append(com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(parcel, header));
                            break;
                        case 7:
                            java.lang.String strCreateString = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, header);
                            sb.append("\"");
                            sb.append(com.google.android.gms.common.util.JsonUtils.escapeString(strCreateString));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] bArrCreateByteArray = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, header);
                            sb.append("\"");
                            sb.append(com.google.android.gms.common.util.Base64Utils.encode(bArrCreateByteArray));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] bArrCreateByteArray2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createByteArray(parcel, header);
                            sb.append("\"");
                            sb.append(com.google.android.gms.common.util.Base64Utils.encodeUrlSafe(bArrCreateByteArray2));
                            sb.append("\"");
                            break;
                        case 10:
                            android.os.Bundle bundleCreateBundle2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(parcel, header);
                            java.util.Set<java.lang.String> setKeySet = bundleCreateBundle2.keySet();
                            sb.append("{");
                            boolean z2 = true;
                            for (java.lang.String str3 : setKeySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(str3);
                                sb.append("\":\"");
                                sb.append(com.google.android.gms.common.util.JsonUtils.escapeString(bundleCreateBundle2.getString(str3)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            android.os.Parcel parcelCreateParcel = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcel(parcel, header);
                            parcelCreateParcel.setDataPosition(0);
                            zaH(sb, field.zah(), parcelCreateParcel);
                            break;
                        default:
                            throw new java.lang.IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() != iValidateObjectHeader) {
            throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException("Overread allowed size end=" + iValidateObjectHeader, parcel);
        }
        sb.append('}');
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeArrayInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.util.ArrayList<T> arrayList) {
        zaG(field);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(arrayList)).size();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((com.google.android.gms.common.server.response.SafeParcelResponse) arrayList.get(i)).zaE());
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelList(this.zab, field.getSafeParcelableFieldId(), arrayList2, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final <T extends com.google.android.gms.common.server.response.FastJsonResponse> void addConcreteTypeInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, T t) {
        zaG(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcel(this.zab, field.getSafeParcelableFieldId(), ((com.google.android.gms.common.server.response.SafeParcelResponse) t).zaE(), true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> getFieldMappings() {
        com.google.android.gms.common.server.response.zan zanVar = this.zad;
        if (zanVar == null) {
            return null;
        }
        return zanVar.zab((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zae));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final java.lang.Object getValueObject(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, com.google.android.gms.common.server.response.FastJsonResponse
    public final boolean isPrimitiveFieldSet(java.lang.String str) {
        throw new java.lang.UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setBooleanInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, boolean z) {
        zaG(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(this.zab, field.getSafeParcelableFieldId(), z);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setDecodedBytesInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, byte[] bArr) {
        zaG(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(this.zab, field.getSafeParcelableFieldId(), bArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setIntegerInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, int i) {
        zaG(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(this.zab, field.getSafeParcelableFieldId(), i);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setLongInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, long j) {
        zaG(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(this.zab, field.getSafeParcelableFieldId(), j);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setStringInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.lang.String str2) {
        zaG(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(this.zab, field.getSafeParcelableFieldId(), str2, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setStringMapInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        zaG(field);
        android.os.Bundle bundle = new android.os.Bundle();
        for (java.lang.String str2 : ((java.util.Map) com.google.android.gms.common.internal.Preconditions.checkNotNull(map)).keySet()) {
            bundle.putString(str2, map.get(str2));
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBundle(this.zab, field.getSafeParcelableFieldId(), bundle, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void setStringsInternal(com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field, java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
        zaG(field);
        int size = ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(arrayList)).size();
        java.lang.String[] strArr = new java.lang.String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = arrayList.get(i);
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringArray(this.zab, field.getSafeParcelableFieldId(), strArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    public final java.lang.String toString() {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zad, "Cannot convert to JSON on client side.");
        android.os.Parcel parcelZaE = zaE();
        parcelZaE.setDataPosition(0);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(100);
        zaH(sb, (java.util.Map) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zad.zab((java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zae))), parcelZaE);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        com.google.android.gms.common.server.response.zan zanVar;
        int i2 = this.zaa;
        int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, i2);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcel(parcel, 2, zaE(), false);
        int i3 = this.zac;
        if (i3 != 0) {
            zanVar = i3 != 1 ? this.zad : this.zad;
        } else {
            zanVar = null;
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, zanVar, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zab(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.math.BigDecimal bigDecimal) {
        zaG(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigDecimal(this.zab, field.getSafeParcelableFieldId(), bigDecimal, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zad(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        zaG(field);
        int size = ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(arrayList)).size();
        java.math.BigDecimal[] bigDecimalArr = new java.math.BigDecimal[size];
        for (int i = 0; i < size; i++) {
            bigDecimalArr[i] = (java.math.BigDecimal) arrayList.get(i);
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigDecimalArray(this.zab, field.getSafeParcelableFieldId(), bigDecimalArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zaf(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.math.BigInteger bigInteger) {
        zaG(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigInteger(this.zab, field.getSafeParcelableFieldId(), bigInteger, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zah(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        zaG(field);
        int size = ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(arrayList)).size();
        java.math.BigInteger[] bigIntegerArr = new java.math.BigInteger[size];
        for (int i = 0; i < size; i++) {
            bigIntegerArr[i] = (java.math.BigInteger) arrayList.get(i);
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBigIntegerArray(this.zab, field.getSafeParcelableFieldId(), bigIntegerArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zak(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        zaG(field);
        int size = ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(arrayList)).size();
        boolean[] zArr = new boolean[size];
        for (int i = 0; i < size; i++) {
            zArr[i] = ((java.lang.Boolean) arrayList.get(i)).booleanValue();
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBooleanArray(this.zab, field.getSafeParcelableFieldId(), zArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zan(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, double d) {
        zaG(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDouble(this.zab, field.getSafeParcelableFieldId(), d);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zap(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        zaG(field);
        int size = ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(arrayList)).size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = ((java.lang.Double) arrayList.get(i)).doubleValue();
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeDoubleArray(this.zab, field.getSafeParcelableFieldId(), dArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zar(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, float f) {
        zaG(field);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloat(this.zab, field.getSafeParcelableFieldId(), f);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zat(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        zaG(field);
        int size = ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(arrayList)).size();
        float[] fArr = new float[size];
        for (int i = 0; i < size; i++) {
            fArr[i] = ((java.lang.Float) arrayList.get(i)).floatValue();
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeFloatArray(this.zab, field.getSafeParcelableFieldId(), fArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zaw(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        zaG(field);
        int size = ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(arrayList)).size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((java.lang.Integer) arrayList.get(i)).intValue();
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntArray(this.zab, field.getSafeParcelableFieldId(), iArr, true);
    }

    @Override // com.google.android.gms.common.server.response.FastJsonResponse
    protected final void zaz(com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.String str, java.util.ArrayList arrayList) {
        zaG(field);
        int size = ((java.util.ArrayList) com.google.android.gms.common.internal.Preconditions.checkNotNull(arrayList)).size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((java.lang.Long) arrayList.get(i)).longValue();
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLongArray(this.zab, field.getSafeParcelableFieldId(), jArr, true);
    }

    private SafeParcelResponse(com.google.android.gms.common.internal.safeparcel.SafeParcelable safeParcelable, com.google.android.gms.common.server.response.zan zanVar, java.lang.String str) {
        this.zaa = 1;
        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
        this.zab = parcelObtain;
        safeParcelable.writeToParcel(parcelObtain, 0);
        this.zac = 1;
        this.zad = (com.google.android.gms.common.server.response.zan) com.google.android.gms.common.internal.Preconditions.checkNotNull(zanVar);
        this.zae = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zaf = 2;
    }

    private final void zaG(com.google.android.gms.common.server.response.FastJsonResponse.Field field) {
        if (field.zaf == -1) {
            throw new java.lang.IllegalStateException("Field does not have a valid safe parcelable field id.");
        }
        android.os.Parcel parcel = this.zab;
        if (parcel == null) {
            throw new java.lang.IllegalStateException("Internal Parcel object is null.");
        }
        int i = this.zaf;
        if (i != 0) {
            if (i != 1) {
                throw new java.lang.IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
            }
        } else {
            this.zag = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
            this.zaf = 1;
        }
    }

    private static final void zaJ(java.lang.StringBuilder sb, com.google.android.gms.common.server.response.FastJsonResponse.Field field, java.lang.Object obj) {
        if (!field.zab) {
            zaI(sb, field.zaa, obj);
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        sb.append(com.ironsource.y8.i.d);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i != 0) {
                sb.append(",");
            }
            zaI(sb, field.zaa, arrayList.get(i));
        }
        sb.append(com.ironsource.y8.i.e);
    }

    public final android.os.Parcel zaE() {
        int i = this.zaf;
        if (i == 0) {
            int iBeginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(this.zab);
            this.zag = iBeginObjectHeader;
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(this.zab, iBeginObjectHeader);
            this.zaf = 2;
        } else if (i == 1) {
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(this.zab, this.zag);
            this.zaf = 2;
        }
        return this.zab;
    }

    public SafeParcelResponse(com.google.android.gms.common.server.response.zan zanVar, java.lang.String str) {
        this.zaa = 1;
        this.zab = android.os.Parcel.obtain();
        this.zac = 0;
        this.zad = (com.google.android.gms.common.server.response.zan) com.google.android.gms.common.internal.Preconditions.checkNotNull(zanVar);
        this.zae = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zaf = 0;
    }

    private static final void zaI(java.lang.StringBuilder sb, int i, java.lang.Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(com.google.android.gms.common.util.JsonUtils.escapeString(com.google.android.gms.common.internal.Preconditions.checkNotNull(obj).toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(com.google.android.gms.common.util.Base64Utils.encode((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(com.google.android.gms.common.util.Base64Utils.encodeUrlSafe((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                com.google.android.gms.common.util.MapUtils.writeStringMapToJson(sb, (java.util.HashMap) com.google.android.gms.common.internal.Preconditions.checkNotNull(obj));
                return;
            case 11:
                throw new java.lang.IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new java.lang.IllegalArgumentException("Unknown type = " + i);
        }
    }
}
