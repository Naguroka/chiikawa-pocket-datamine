package com.pairip.licensecheck;

/* JADX INFO: loaded from: classes2.dex */
public class LicenseResponseHelper {
    private static final java.lang.String KEY_FACTORY_ALGORITHM = "RSA";
    private static final java.lang.String PAYLOAD_LICENSE_DATA = "LICENSE_DATA";
    private static final java.lang.String PAYLOAD_PACKAGE_NAME = "packageName";
    private static final java.lang.String PAYLOAD_REPEATED_CHECK_DURATION_TO_RETRY_MILLIS = "repeatedCheckDurationToRetryMillis";
    private static final java.lang.String PAYLOAD_REPEATED_CHECK_TIME_TO_RETRY_MILLIS = "repeatedCheckTimeToRetryMillis";
    private static final java.lang.String SIGNATURE_ALGORITHM = "SHA256withRSA";
    private static final java.nio.charset.Charset UTF_8 = java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING);

    public static void validateResponse(android.os.Bundle responsePayload, java.lang.String packageName) throws com.pairip.licensecheck.LicenseCheckException {
        try {
            java.lang.String[] jwsPartsForLicenseData = getJwsPartsForLicenseData(responsePayload);
            org.json.JSONObject jSONObjectBase64ToJson = base64ToJson(jwsPartsForLicenseData[0]);
            org.json.JSONObject jSONObjectBase64ToJson2 = base64ToJson(jwsPartsForLicenseData[1]);
            java.lang.String str = jwsPartsForLicenseData[2];
            java.lang.String str2 = jwsPartsForLicenseData[0] + "." + jwsPartsForLicenseData[1];
            if (!jSONObjectBase64ToJson.getString("alg").equals("RS256")) {
                throw new com.pairip.licensecheck.LicenseCheckException("Response must be signed with RS256 algorithm.");
            }
            verifySignature(str2, str, SIGNATURE_ALGORITHM, getPublicKey());
            if (!jSONObjectBase64ToJson2.getString("packageName").equals(packageName)) {
                throw new com.pairip.licensecheck.LicenseCheckException("Package name doesn't match.");
            }
        } catch (org.json.JSONException e) {
            throw new com.pairip.licensecheck.LicenseCheckException("Could not decode json", e);
        }
    }

    public static com.pairip.licensecheck.RepeatedCheckMetadata getRepeatedCheckMetadata(android.os.Bundle responsePayload) throws com.pairip.licensecheck.LicenseCheckException {
        try {
            org.json.JSONObject jSONObjectBase64ToJson = base64ToJson(getJwsPartsForLicenseData(responsePayload)[1]);
            if (jSONObjectBase64ToJson.has(PAYLOAD_REPEATED_CHECK_DURATION_TO_RETRY_MILLIS) && jSONObjectBase64ToJson.has(PAYLOAD_REPEATED_CHECK_TIME_TO_RETRY_MILLIS)) {
                return new com.pairip.licensecheck.RepeatedCheckMetadata(jSONObjectBase64ToJson.getLong(PAYLOAD_REPEATED_CHECK_DURATION_TO_RETRY_MILLIS), jSONObjectBase64ToJson.getLong(PAYLOAD_REPEATED_CHECK_TIME_TO_RETRY_MILLIS));
            }
            return null;
        } catch (java.lang.IllegalArgumentException e) {
            throw new com.pairip.licensecheck.LicenseCheckException("Invalid repeated check payload", e);
        } catch (org.json.JSONException e2) {
            throw new com.pairip.licensecheck.LicenseCheckException("Could not decode json", e2);
        }
    }

    private static java.lang.String[] getJwsPartsForLicenseData(android.os.Bundle responsePayload) throws com.pairip.licensecheck.LicenseCheckException {
        java.lang.String string = responsePayload.getString(PAYLOAD_LICENSE_DATA);
        if (string == null) {
            throw new com.pairip.licensecheck.LicenseCheckException("Invalid response");
        }
        java.lang.String[] strArrSplit = string.split("\\.", -1);
        if (strArrSplit.length == 3) {
            return strArrSplit;
        }
        throw new com.pairip.licensecheck.LicenseCheckException("Invalid response");
    }

    private static org.json.JSONObject base64ToJson(java.lang.String input) throws com.pairip.licensecheck.LicenseCheckException {
        try {
            return new org.json.JSONObject(new java.lang.String(android.util.Base64.decode(input, 8), UTF_8));
        } catch (java.lang.IllegalArgumentException | org.json.JSONException e) {
            throw new com.pairip.licensecheck.LicenseCheckException("Invalid response", e);
        }
    }

    private static void verifySignature(java.lang.String signedData, java.lang.String signature, java.lang.String signatureAlgorithm, java.security.PublicKey publicKey) throws com.pairip.licensecheck.LicenseCheckException {
        try {
            java.security.Signature signature2 = java.security.Signature.getInstance(signatureAlgorithm);
            signature2.initVerify(publicKey);
            signature2.update(signedData.getBytes(UTF_8));
            if (signature2.verify(android.util.Base64.decode(signature, 8))) {
            } else {
                throw new com.pairip.licensecheck.LicenseCheckException("Signature verification failed.");
            }
        } catch (java.lang.IllegalArgumentException e) {
            throw new com.pairip.licensecheck.LicenseCheckException("Could not base64 decode returned signature", e);
        } catch (java.security.InvalidKeyException e2) {
            throw new com.pairip.licensecheck.LicenseCheckException("Could not sign data with the public key", e2);
        } catch (java.security.NoSuchAlgorithmException e3) {
            throw new com.pairip.licensecheck.LicenseCheckException(java.lang.String.format("Could not find %s algorithm on the device", signatureAlgorithm), e3);
        } catch (java.security.SignatureException e4) {
            throw new com.pairip.licensecheck.LicenseCheckException("Could not parse returned signature.", e4);
        }
    }

    private static java.security.PublicKey getPublicKey() throws com.pairip.licensecheck.LicenseCheckException {
        try {
            return java.security.KeyFactory.getInstance(KEY_FACTORY_ALGORITHM).generatePublic(new java.security.spec.X509EncodedKeySpec(android.util.Base64.decode(com.pairip.licensecheck.LicenseClient.getLicensePubKey(), 0)));
        } catch (java.lang.IllegalArgumentException e) {
            throw new com.pairip.licensecheck.LicenseCheckException("Could not decode public key", e);
        } catch (java.security.NoSuchAlgorithmException e2) {
            throw new com.pairip.licensecheck.LicenseCheckException(java.lang.String.format("%s algorithm not found on device", KEY_FACTORY_ALGORITHM), e2);
        } catch (java.security.spec.InvalidKeySpecException e3) {
            throw new com.pairip.licensecheck.LicenseCheckException("Could not create key specification from the public key", e3);
        }
    }

    private LicenseResponseHelper() {
    }
}
