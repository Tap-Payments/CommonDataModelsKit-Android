package company.tap.commondatamodelskit_android

/**
 *
 * Created by Mario Gamal on 4/15/20
 * Copyright © 2020 Tap Payments. All rights reserved.
 *
 */
data class TapCard(
    var id: String,
    var objecT: String,
    var firstSix: String,
    var lastFour: String,
    var expMonth: String,
    var expYear: String,
    var brand: CardBrand,
    var name: String,
    var bin: String,
    var expiry: String,
    var currency: TapCurrency,
    var scheme: CardScheme,
    var supportedCurrencies: List<TapCurrency>,
    var orderBy: String,
    var paymentMethodId: String,
    var fingerprint: String,
    var image: String
)