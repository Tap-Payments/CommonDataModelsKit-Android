package company.tap.commonmodels

import com.google.gson.annotations.SerializedName

/**
 *
 * Created by Mario Gamal on 4/15/20
 * Copyright © 2020 Tap Payments. All rights reserved.
 *
 */
enum class CardBrand(var rawValue: String) {

    @SerializedName("aiywaLoyalty")
    aiywaLoyalty("aiywaLoyalty"),

    @SerializedName(value = "AMEX", alternate = ["AMERICAN_EXPRESS"])
    americanExpress("AMEX"),

    @SerializedName("BENEFIT")
    benefit("BENEFIT"),

    @SerializedName("CARDGUARD")
    cardGuard("CARDGUARD"),

    @SerializedName("CBK")
    cbk("CBK"),

    @SerializedName("DANKORT")
    dankort("DANKORT"),

    @SerializedName("DISCOVER")
    discover("DISCOVER"),

    @SerializedName(value = "DINERS_CLUB", alternate = ["DINERS"])
    dinersClub("DINERS_CLUB"),

    @SerializedName("FAWRY")
    fawry("FAWRY"),

    @SerializedName("INSTAPAY")
    instaPayment("INSTAPAY"),

    @SerializedName("INTERPAY")
    interPayment("INTERPAY"),

    @SerializedName("JCB")
    jcb("JCB"),

    @SerializedName("KNET")
    knet("KNET"),

    @SerializedName("MADA")
    mada("MADA"),

    @SerializedName("MAESTRO")
    maestro("MAESTRO"),

    @SerializedName("MASTERCARD")
    masterCard("MASTERCARD"),

    @SerializedName("NAPS")
    naps("NAPS"),

    @SerializedName("NSPK")
    nspkMir("NSPK"),

    @SerializedName(value = "OMAN_NET", alternate = ["OMANNET"])
    omanNet("OMAN_NET"),

    @SerializedName("STC_PAY")
    stcPay("STC_PAY"),

    @SerializedName("SADAD_ACCOUNT")
    sadad("SADAD_ACCOUNT"),

    @SerializedName("TAP")
    tap("TAP"),

    @SerializedName("UATP")
    uatp("UATP"),

    @SerializedName(value = "UNION_PAY", alternate = ["UNIONPAY"])
    unionPay("UNION_PAY"),

    @SerializedName("VERVE")
    verve("VERVE"),

    @SerializedName("VISA")
    visa("VISA"),

    @SerializedName("Viva PAY")
    viva("Viva PAY"),

    @SerializedName("Wataniya PAY")
    wataniya("Wataniya PAY"),

    @SerializedName("Zain PAY")
    zain("Zain PAY"),

    @SerializedName("")
    unknown("")

}