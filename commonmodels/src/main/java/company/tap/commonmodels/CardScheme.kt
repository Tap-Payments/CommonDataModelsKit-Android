package company.tap.commonmodels

import com.google.gson.annotations.SerializedName

/**
 *
 * Created by Mario Gamal on 4/15/20
 * Copyright © 2020 Tap Payments. All rights reserved.
 *
 */
enum class CardScheme {
    /**
     * Knet card scheme.
     */
    @SerializedName("KNET")
    KNET,
    /**
     * Visa card scheme.
     */
    @SerializedName("VISA")
    VISA,
    /**
     * Mastercard card scheme.
     */
    @SerializedName("MASTERCARD")
    MASTERCARD,
    /**
     * American express card scheme.
     */
    @SerializedName("AMERICAN_EXPRESS")
    AMERICAN_EXPRESS,
    /**
     * Mada card scheme.
     */
    @SerializedName("MADA")
    MADA,
    /**
     * Benefit card scheme.
     */
    @SerializedName("BENEFIT")
    BENEFIT,
    /**
     * Sadad card scheme.
     */
    @SerializedName("SADAD_ACCOUNT")
    SADAD,
    /**
     * Fawry card scheme.
     */
    @SerializedName("FAWRY")
    FAWRY,
    /**
     * Naps card scheme.
     */
    @SerializedName("NAPS")
    NAPS,
    /**
     * Oman net card scheme.
     */
    @SerializedName("OMAN_NET")
    OMAN_NET;
}