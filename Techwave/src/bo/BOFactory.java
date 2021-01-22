package bo;

import bo.custom.impl.AdminBOImpl;
import bo.custom.impl.CustomerBOImpl;
import bo.custom.impl.MakeOrderBOImpl;
import bo.custom.impl.ProductBOImpl;

public class BOFactory {
    static BOFactory boFactory;

    private BOFactory(){}

    public static BOFactory getInstance() {
        return (boFactory == null) ? boFactory = new BOFactory() : boFactory;
    }

    public enum BOType{
        CUSTOMER,PRODUCT,ADMIN,MO;
    }
    public SuperBO getBO(BOType boType){
        switch(boType){
            case CUSTOMER:
                return new CustomerBOImpl();
            case PRODUCT:
                return new ProductBOImpl();
            case ADMIN:
                return new AdminBOImpl();
            case MO:
                return new MakeOrderBOImpl();
            default:
                return null;
        }
    }
}
