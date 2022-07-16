import axios from 'axios';
import icon from '../../asserts/img/notification-ico.svg';
import { BASE_URL } from '../../utils/request';
import './styles.css';

type Props = {
    saleId: number;
}
function handleClick(id : number){

    axios(`${BASE_URL}/sales/${id}/notification2`)
    .then(response => {
        console.log("Funciona");
    });
}

function NotificationButton({saleId} : Props){
    return(
        <div className="dsmeta-red-btn" onClick={() => handleClick(saleId)}>
        <img src={icon} alt="Notificar" />
    </div>
    )
}

export default NotificationButton;