package au.whatsup.app;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.ResponseErrorHandler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

@Component
@Log4j2
public class ZoResponseErrorHandler implements ResponseErrorHandler {

    @Override
    public boolean hasError(ClientHttpResponse clientHttpResponse) throws IOException {
        return true;
    }

    @Override
    public void handleError(ClientHttpResponse clientHttpResponse) throws IOException {
        if (!clientHttpResponse.getStatusCode().equals(HttpStatus.OK)) {
            final String bodyMessage = new BufferedReader(new InputStreamReader(clientHttpResponse.getBody())).lines().collect(Collectors.joining("\n"));
            log.error("Error {} while processing the request {}. ", clientHttpResponse.getStatusCode(), clientHttpResponse.getStatusText());
            log.error("Detailed error message => {}.", bodyMessage);
        }
    }
}
