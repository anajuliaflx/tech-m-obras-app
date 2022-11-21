import EditFormConstruction from "../src/components/FormConstruction/EditConstruction";
import Nav from "../src/components/Nav";
import Footer from "../src/components/patterns/Footer";
import HeadComponent from "../src/components/patterns/Head";
import styles from '../styles/Home.module.css'

export default function edit() {
  return (
    <div >
      <HeadComponent />
      <Nav />
      <EditFormConstruction/>
      <Footer style={styles.footer} />
    </div>
  )
}