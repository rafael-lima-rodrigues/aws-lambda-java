package helloworld;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import helloworld.data.CartData;
import helloworld.data.PromotionData;

public class PromotionHandler implements RequestHandler<CartData, PromotionData>
{
    @Override
    public PromotionData handleRequest(CartData input, Context context) {

        PromotionData promotionData = new PromotionData();
        String promoMsg="";
        if (input.getSum()>1000){
            promotionData.setReducePrice(input.getSum() - input.getSum()/10);
            promoMsg +="10% discount applied";
        }

        if (input.getCouponCode().equalsIgnoreCase("freeShipping")){
            promotionData.setFreeShipping(true);
            promoMsg += "Free shipping applied";
        }

        promotionData.setPromoMsg(promoMsg);
        return promotionData;
    }
}
