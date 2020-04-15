package company.tap.commonmodels

/**
 *
 * Created by Mario Gamal on 4/15/20
 * Copyright © 2020 Tap Payments. All rights reserved.
 *
 */
data class TapCard(
    var id: String? = null,
    var cardObject: String? = null,
    var firstSix: String? = null,
    var lastFour: String? = null,
    var expMonth: String? = null,
    var expYear: String? = null,
    var brand: CardBrand? = null,
    var name: String? = null,
    var bin: String? = null,
    var expiry: String? = null,
    var currency: TapCurrency? = null,
    var scheme: CardScheme? = null,
    var supportedCurrencies: List<TapCurrency>? = null,
    var orderBy: String? = null,
    var paymentMethodId: String? = null,
    var fingerprint: String? = null,
    var image: String? = null
)