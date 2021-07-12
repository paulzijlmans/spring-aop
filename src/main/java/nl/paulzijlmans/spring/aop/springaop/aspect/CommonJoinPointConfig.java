package nl.paulzijlmans.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("execution(* nl.paulzijlmans.spring.aop.springaop.data.*.*(..))")
    public void dataLayerExecution() {
    }

    @Pointcut("execution(* nl.paulzijlmans.spring.aop.springaop.business.*.*(..))")
    public void businessLayerExecution() {
    }
}
