package auth0.grails3.mvc.sample

import com.auth0.web.Auth0Config
import com.auth0.Auth0User
import com.auth0.SessionUtils
import org.springframework.beans.factory.annotation.Autowired

class HomeController {

    static defaultAction = "home"

    @Autowired
    Auth0Config auth0Config

    def home() {
        log.info("Home page")
        Auth0User user = SessionUtils.getAuth0User(request)
        [user: user]
    }
}
