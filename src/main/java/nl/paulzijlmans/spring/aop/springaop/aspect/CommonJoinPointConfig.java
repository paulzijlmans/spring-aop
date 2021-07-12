package nl.paulzijlmans.spring.aop.springaop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("execution(* nl.paulzijlmans.spring.aop.springaop.data.*.*(..))")
    public void dataLayerExecution() {
    }

    @Pointcut("execution(* nl.paulzijlmans.spring.aop.springaop.business.*.*(..))")
    public void businessLayerExecution() {
    }

    @Pointcut("execution(* nl.paulzijlmans.spring.aop.springaop.data.*.*(..)) && execution(* nl.paulzijlmans.spring.aop.springaop.business.*.*(..))")
    public void allLayerExecution() {
    }

    @Pointcut("bean(*dao*)")
    public void beanContainingDao() {
    }

    @Pointcut("within(nl.paulzijlmans.spring.aop.springaop.data..*)")
    public void dataLayerExecutionWithWithin() {
    }

    @Pointcut("@annotation(nl.paulzijlmans.spring.aop.springaop.aspect.TrackTime)")
    public void trackTimeAnnotation() {
    }
}
