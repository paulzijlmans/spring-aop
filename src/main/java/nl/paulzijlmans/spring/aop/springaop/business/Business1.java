package nl.paulzijlmans.spring.aop.springaop.business;

import nl.paulzijlmans.spring.aop.springaop.aspect.TrackTime;
import nl.paulzijlmans.spring.aop.springaop.data.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    @Autowired
    private Dao1 dao1;

    @TrackTime
    public String calculateSomething() {
        return dao1.retrieveSomething();
    }
}
