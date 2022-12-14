import EditFormConstruction from "../src/components/FormConstruction/editConstruction";
import Nav from "../src/components/Nav";
import Footer from "../src/components/patterns/Footer";
import HeadComponent from "../src/components/patterns/Head";
import styles from '../styles/Home.module.css'

export default function EditConstruction() {
  return (
    <div >
      <HeadComponent />
      <Nav />
      <EditFormConstruction/>
      <Footer style={styles.footer} />
    </div>
  )
}