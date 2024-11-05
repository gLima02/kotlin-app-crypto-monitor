package glima02.com.github.kotlin_app_crypto_monitor

import glima02.com.github.kotlin_app_crypto_monitor.model.TickerResponse
import retrofit2.Response
import retrofit2.http.GET
interface MercadoBitcoinService {
    @GET("api/BTC/ticker/")
    suspend fun getTicker(): Response<TickerResponse>
}