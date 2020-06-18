package com.nendrasys.core.payment.command;

import de.hybris.platform.payment.AdapterException;
import de.hybris.platform.payment.commands.factory.CommandFactory;
import de.hybris.platform.payment.commands.impl.CommandFactoryRegistryMockImpl;
import de.hybris.platform.payment.dto.BasicCardInfo;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

public class CustomCommandFactoryRegistryMockImpl extends CommandFactoryRegistryMockImpl {

    public static final String MOCKUP_PAYMENT_PROVIDER = "Mockup";
    private ApplicationContext applicationContext;

    public CommandFactory getFactory(String paymentProvider) throws AdapterException {
        if ("Mockup".equals(paymentProvider)) {
            return (CommandFactory)this.applicationContext.getBean("customMockupCommandFactory", CommandFactory.class);
        } else {
            throw new AdapterException("'''The requested paymentProvider should be <Mockup> instead of <" + paymentProvider + ">");
        }
    }

    public CommandFactory getFactory(BasicCardInfo card, boolean threeD) throws AdapterException {
        return (CommandFactory)this.applicationContext.getBean("customMockupCommandFactory", CommandFactory.class);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
