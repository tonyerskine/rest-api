/*
 * Copyright (c) 2016 by SharpTop Software, LLC
 * All rights reserved. No part of this software project may be used, reproduced, distributed, or transmitted in any
 * form or by any means, including photocopying, recording, or other electronic or mechanical methods, without the prior
 * written permission of SharpTop Software, LLC. For permission requests, write to the author at info@sharptop.co.
 */

package co.sharptop.church

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Config)
class ConfigSpec extends Specification {

    def setup() {
        new Config(appName: "bacon").save(validate: false)
    }

    def cleanup() {
    }

    void "test appName"() {
        when:
        def result = Config.current.appName

        then:
        result == "bacon"
    }
}
