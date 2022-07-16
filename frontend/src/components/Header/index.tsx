import logo from '../../asserts/img/logo.svg';

import './styles.css';

function Header() {

    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={logo} alt="DSmeta" />
                <h1>DSMeta</h1>
                <p>Desenvolvido por
                    <a href="https://www.youtube.com/watch?v=FYgIpVf9TBI&t=0s"> Deve-1</a>
                </p>
            </div>

        </header>
    )
}

export default Header;