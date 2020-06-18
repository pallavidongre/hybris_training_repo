package com.nendrasys.core.payment.command;

import de.hybris.platform.payment.commands.impl.CaptureMockCommand;
import de.hybris.platform.payment.commands.request.CaptureRequest;
import de.hybris.platform.payment.commands.result.CaptureResult;

public class CustomCaptureMockCommand extends CaptureMockCommand {
    @Override
    public CaptureResult perform(CaptureRequest request) {
        System.out.println("**************Inside CustomCaptureMockCommand*****************");
        return super.perform(request);
    }
}
