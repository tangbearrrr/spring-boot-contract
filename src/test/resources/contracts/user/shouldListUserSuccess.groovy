import org.springframework.cloud.contract.spec.Contract

Contract.make {
    name("List User Success")
    request {
        method GET()
        headers {
            header('key', 'value')
            contentType(applicationJson())
        }
        cookies {
            cookie('another_key', 'another_value')
        }
        urlPath("/users")
    }
    response {
        status OK()
        headers {
            contentType(applicationJson())
        }
    }
}