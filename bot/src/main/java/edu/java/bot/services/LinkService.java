package edu.java.bot.services;

import edu.java.bot.models.Link;
import edu.java.bot.repositories.LinkRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class LinkService {
    private final LinkRepository linkRepository;

    @Transactional(readOnly = true)
    public Optional<Link> findByUrl(String url) {
        return linkRepository.findByUrl(url);
    }

    @Transactional
    public void save(Link link) {
        linkRepository.save(link);
    }
}
