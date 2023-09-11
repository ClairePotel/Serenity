# language: fr

Fonctionnalité: Connexion au site Amazon via un compte client
  Contexte: un utilisateur accepte les cookies
    Soit un utilisateur sur la page des cookies du site "https://www.amazon.fr"
    Quand il clique sur le bouton Accepter
    Alors il revient sur la page d accueil

  Plan du scénario: Un client se connecte sur le site via son compte
    Quand il clique sur le bouton Se connecter
    Et il saisit son mail <mail>
    Et il clique sur le bouton Continuer
    Et il saisit son password <password>
    Et il clique sur le bouton s identifier
    Alors l ecran d accueil s affiche et affiche le nom du client <name>
    Exemples:
    | mail                              | password       | name     |
    | "damien.automatisation@gmail.com" | "Aa123456!" | "Damien" |

  @2
  Scénario: Recherche via la barre de recherche
    Quand il tape le mot "Livres" dans la barre de recherche
    Alors la page de la liste des "livres" s affiche
