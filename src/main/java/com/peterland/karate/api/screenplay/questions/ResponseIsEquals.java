package com.peterland.karate.api.screenplay.questions;

import com.peterland.karate.api.screenplay.tasks.KarateRunner;
import com.peterland.karate.api.screenplay.tasks.Resource;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

import static com.peterland.karate.api.screenplay.tasks.BaseScript.VERIFY_RESPONSE;

@Subject("the response must be equal to the expected response")
public class ResponseIsEquals implements Question<Boolean> {

    private final Resource resource;

    public ResponseIsEquals(Resource resource) {
        this.resource = resource;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(KarateRunner.run(VERIFY_RESPONSE, resource));
        return true;
    }
}
